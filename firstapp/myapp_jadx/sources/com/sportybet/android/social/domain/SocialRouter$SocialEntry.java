package com.sportybet.android.social.domain;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.djx;
import defpackage.eal;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.mtg0;
import defpackage.nex;
import defpackage.nyf;
import defpackage.ohx;
import defpackage.uts;
import defpackage.z620;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SocialRouter$SocialEntry implements ohx {
    public static final SocialRouter$SocialEntry a = new SocialRouter$SocialEntry();

    public static final class a extends djx<Data> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (Data) bundle.getParcelable(str);
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Data h(String str) {
            str.getClass();
            Object objE = new eal().e(Uri.decode(str), Data.class);
            objE.getClass();
            return (Data) objE;
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Data data) {
            str.getClass();
            bundle.putParcelable(str, data);
        }
    }

    @Override // defpackage.cjx
    public final List<nex> G0() {
        gfx gfxVar = new gfx();
        a aVar = new a(true);
        ffx.a aVar2 = gfxVar.a;
        aVar2.a = aVar;
        aVar2.b = true;
        Unit unit = Unit.a;
        return kotlin.collections.a.c(new nex("arg_social_entry_data", aVar2.a()));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SocialRouter$SocialEntry);
    }

    public final int hashCode() {
        return -454073596;
    }

    public final String toString() {
        return "SocialEntry";
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\u0016¨\u0006-"}, d2 = {"Lcom/sportybet/android/social/domain/SocialRouter$SocialEntry$Data;", "Landroid/os/Parcelable;", "", "username", "", "isCreation", "bookingCode", "isCodeLive", "previewCode", "initialTab", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZLjava/lang/String;ZZLjava/lang/String;)Lcom/sportybet/android/social/domain/SocialRouter$SocialEntry$Data;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "Z", "getBookingCode", "getPreviewCode", "getInitialTab", "Companion", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {
        public static final int $stable = 8;
        private final String bookingCode;
        private final String initialTab;
        private final boolean isCodeLive;
        private final boolean isCreation;
        private final boolean previewCode;
        private final String username;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Parcelable.Creator<Data> CREATOR = new b();
        private static final Data EMPTY = new Data("", false, null, false, false, null);

        /* JADX INFO: renamed from: com.sportybet.android.social.domain.SocialRouter$SocialEntry$Data$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final class b implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                boolean z;
                parcel.getClass();
                String string = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z2 = true;
                    z = true;
                } else {
                    z = true;
                }
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = z2;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new Data(string, z2, string2, z, z, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public /* synthetic */ Data(String str, boolean z, String str2, boolean z2, boolean z3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str3);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, boolean z, String str2, boolean z2, boolean z3, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.username;
            }
            if ((i & 2) != 0) {
                z = data.isCreation;
            }
            if ((i & 4) != 0) {
                str2 = data.bookingCode;
            }
            if ((i & 8) != 0) {
                z2 = data.isCodeLive;
            }
            if ((i & 16) != 0) {
                z3 = data.previewCode;
            }
            if ((i & 32) != 0) {
                str3 = data.initialTab;
            }
            boolean z4 = z3;
            String str4 = str3;
            return data.copy(str, z, str2, z2, z4, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsCreation() {
            return this.isCreation;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBookingCode() {
            return this.bookingCode;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsCodeLive() {
            return this.isCodeLive;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getPreviewCode() {
            return this.previewCode;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getInitialTab() {
            return this.initialTab;
        }

        public final Data copy(String username, boolean isCreation, String bookingCode, boolean isCodeLive, boolean previewCode, String initialTab) {
            username.getClass();
            return new Data(username, isCreation, bookingCode, isCodeLive, previewCode, initialTab);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.g(this.username, data.username) && this.isCreation == data.isCreation && Intrinsics.g(this.bookingCode, data.bookingCode) && this.isCodeLive == data.isCodeLive && this.previewCode == data.previewCode && Intrinsics.g(this.initialTab, data.initialTab);
        }

        public final String getBookingCode() {
            return this.bookingCode;
        }

        public final String getInitialTab() {
            return this.initialTab;
        }

        public final boolean getPreviewCode() {
            return this.previewCode;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iA = mtg0.a(this.username.hashCode() * 31, 31, this.isCreation);
            String str = this.bookingCode;
            int iA2 = mtg0.a(mtg0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCodeLive), 31, this.previewCode);
            String str2 = this.initialTab;
            return iA2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean isCodeLive() {
            return this.isCodeLive;
        }

        public final boolean isCreation() {
            return this.isCreation;
        }

        public String toString() {
            String str = this.username;
            boolean z = this.isCreation;
            String str2 = this.bookingCode;
            boolean z2 = this.isCodeLive;
            boolean z3 = this.previewCode;
            String str3 = this.initialTab;
            StringBuilder sbA = z620.a("Data(username=", str, ", isCreation=", ", bookingCode=", z);
            uts.b(str2, ", isCodeLive=", ", previewCode=", sbA, z2);
            return nyf.a(", initialTab=", str3, ")", sbA, z3);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.username);
            dest.writeInt(this.isCreation ? 1 : 0);
            dest.writeString(this.bookingCode);
            dest.writeInt(this.isCodeLive ? 1 : 0);
            dest.writeInt(this.previewCode ? 1 : 0);
            dest.writeString(this.initialTab);
        }

        public Data(String str, boolean z, String str2, boolean z2, boolean z3, String str3) {
            str.getClass();
            this.username = str;
            this.isCreation = z;
            this.bookingCode = str2;
            this.isCodeLive = z2;
            this.previewCode = z3;
            this.initialTab = str3;
        }

        public Data() {
            this(null, false, null, false, false, null, 63, null);
        }
    }
}
