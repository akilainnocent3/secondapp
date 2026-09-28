package com.sportybet.android.widget.seekbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new a();
    public float a;
    public float b;
    public float c;
    public int d;
    public float e;
    public float f;

    public class a implements Parcelable.Creator<SavedState> {
        @Override // android.os.Parcelable.Creator
        public final SavedState createFromParcel(Parcel parcel) {
            SavedState savedState = new SavedState(parcel);
            savedState.a = parcel.readFloat();
            savedState.b = parcel.readFloat();
            savedState.c = parcel.readFloat();
            savedState.d = parcel.readInt();
            savedState.e = parcel.readFloat();
            savedState.f = parcel.readFloat();
            return savedState;
        }

        @Override // android.os.Parcelable.Creator
        public final SavedState[] newArray(int i) {
            return new SavedState[i];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }
}
