package com.sportybet.android.update.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.appupdate.VersionAutoUpdateConfig;
import com.sporty.android.core.model.config.VersionData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007Ê\u0001\u0002\b\tÊ\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/sportybet/android/update/data/VersionUpdateInput;", "Landroid/os/Parcelable;", "<init>", "()V", "DefaultContent", "CustomContent", "Lcom/sportybet/android/update/data/VersionUpdateInput$CustomContent;", "Lcom/sportybet/android/update/data/VersionUpdateInput$DefaultContent;", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class VersionUpdateInput implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/update/data/VersionUpdateInput$CustomContent;", "Lcom/sportybet/android/update/data/VersionUpdateInput;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CustomContent extends VersionUpdateInput {
        public static final Parcelable.Creator<CustomContent> CREATOR = new a();
        public final String a;

        public static final class a implements Parcelable.Creator<CustomContent> {
            @Override // android.os.Parcelable.Creator
            public final CustomContent createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CustomContent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomContent[] newArray(int i) {
                return new CustomContent[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomContent(String str) {
            super(0);
            str.getClass();
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/update/data/VersionUpdateInput$DefaultContent;", "Lcom/sportybet/android/update/data/VersionUpdateInput;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultContent extends VersionUpdateInput {
        public static final Parcelable.Creator<DefaultContent> CREATOR = new a();
        public final VersionAutoUpdateConfig a;
        public final VersionData b;

        public static final class a implements Parcelable.Creator<DefaultContent> {
            @Override // android.os.Parcelable.Creator
            public final DefaultContent createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DefaultContent(VersionAutoUpdateConfig.valueOf(parcel.readString()), (VersionData) parcel.readParcelable(DefaultContent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DefaultContent[] newArray(int i) {
                return new DefaultContent[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultContent(VersionAutoUpdateConfig versionAutoUpdateConfig, VersionData versionData) {
            super(0);
            versionAutoUpdateConfig.getClass();
            versionData.getClass();
            this.a = versionAutoUpdateConfig;
            this.b = versionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
        }
    }

    public /* synthetic */ VersionUpdateInput(int i) {
        this();
    }

    private VersionUpdateInput() {
    }
}
