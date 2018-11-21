/*
 * Copyright (C) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.materialme;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Data model for each row of the RecyclerView.
 */
class Sport implements Parcelable {

    //Member variables representing the title and information about the sport
    private String title;
    private String info;
    private final int imageResource;

    /**
     * Constructor for the Sport data model
     *
     * @param title The name if the sport.
     * @param info  Information about the sport.
     */
    Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }

    /**
     * Constructor for the Sport data model
     *
     * @param in The name if the sport.
     */
    Sport(Parcel in) {
        this.title = in.readString();
        this.info = in.readString();
        this.imageResource = in.readInt();
    }

    /**
     * Gets the title of the sport
     *
     * @return The title of the sport.
     */
    String getTitle() {
        return title;
    }

    /**
     * Gets the info about the sport
     *
     * @return The info about the sport.
     */
    String getInfo() {
        return info;
    }

    /**
     * Get the image resource of the current sport
     *
     * @return image resource of the sport
     */
    public int getImageResource() {
        return imageResource;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(info);
        dest.writeInt(imageResource);
    }

    public static final Parcelable.Creator<Sport> CREATOR = new Parcelable.Creator<Sport>() {
        public Sport createFromParcel(Parcel in) {
            return new Sport(in);
        }

        public Sport[] newArray(int size) {
            return new Sport[size];
        }
    };
}
