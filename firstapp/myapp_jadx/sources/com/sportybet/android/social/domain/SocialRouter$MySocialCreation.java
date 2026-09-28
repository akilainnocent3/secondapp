package com.sportybet.android.social.domain;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.service.CountryCodeName;
import defpackage.djx;
import defpackage.eal;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.nex;
import defpackage.ohx;
import defpackage.uf80;
import defpackage.vj5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SocialRouter$MySocialCreation implements ohx {
    public static final SocialRouter$MySocialCreation a = new SocialRouter$MySocialCreation();

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

    public static Bundle a(Data data) {
        return vj5.a(new Pair("arg_my_social_creation_data", data));
    }

    @Override // defpackage.cjx
    public final List<nex> G0() {
        gfx gfxVar = new gfx();
        a aVar = new a(true);
        ffx.a aVar2 = gfxVar.a;
        aVar2.a = aVar;
        aVar2.b = true;
        Unit unit = Unit.a;
        return kotlin.collections.a.c(new nex("arg_my_social_creation_data", aVar2.a()));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SocialRouter$MySocialCreation);
    }

    public final int hashCode() {
        return 1659751321;
    }

    public final String toString() {
        return "MySocialCreation";
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0013¨\u0006'"}, d2 = {"Lcom/sportybet/android/social/domain/SocialRouter$MySocialCreation$Data;", "Landroid/os/Parcelable;", "", "username", "Lcom/sporty/android/core/model/service/CountryCodeName;", "countryCode", "toFollow", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sporty/android/core/model/service/CountryCodeName;", "component3", "copy", "(Ljava/lang/String;Lcom/sporty/android/core/model/service/CountryCodeName;Ljava/lang/String;)Lcom/sportybet/android/social/domain/SocialRouter$MySocialCreation$Data;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "Lcom/sporty/android/core/model/service/CountryCodeName;", "getCountryCode", "getToFollow", "Companion", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {
        public static final int $stable = 8;
        private final CountryCodeName countryCode;
        private final String toFollow;
        private final String username;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Parcelable.Creator<Data> CREATOR = new b();
        private static final Data EMPTY = new Data(null, null, null);

        /* JADX INFO: renamed from: com.sportybet.android.social.domain.SocialRouter$MySocialCreation$Data$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final class b implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Data(parcel.readString(), parcel.readInt() == 0 ? null : CountryCodeName.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(String str, CountryCodeName countryCodeName, String str2) {
            this.username = str;
            this.countryCode = countryCodeName;
            this.toFollow = str2;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, CountryCodeName countryCodeName, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.username;
            }
            if ((i & 2) != 0) {
                countryCodeName = data.countryCode;
            }
            if ((i & 4) != 0) {
                str2 = data.toFollow;
            }
            return data.copy(str, countryCodeName, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CountryCodeName getCountryCode() {
            return this.countryCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToFollow() {
            return this.toFollow;
        }

        public final Data copy(String username, CountryCodeName countryCode, String toFollow) {
            return new Data(username, countryCode, toFollow);
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
            return Intrinsics.g(this.username, data.username) && this.countryCode == data.countryCode && Intrinsics.g(this.toFollow, data.toFollow);
        }

        public final CountryCodeName getCountryCode() {
            return this.countryCode;
        }

        public final String getToFollow() {
            return this.toFollow;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            String str = this.username;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CountryCodeName countryCodeName = this.countryCode;
            int iHashCode2 = (iHashCode + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31;
            String str2 = this.toFollow;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.username;
            CountryCodeName countryCodeName = this.countryCode;
            String str2 = this.toFollow;
            StringBuilder sb = new StringBuilder("Data(username=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(countryCodeName);
            sb.append(", toFollow=");
            return uf80.a(sb, str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.username);
            CountryCodeName countryCodeName = this.countryCode;
            if (countryCodeName == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(countryCodeName.name());
            }
            dest.writeString(this.toFollow);
        }

        public /* synthetic */ Data(String str, CountryCodeName countryCodeName, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, countryCodeName, (i & 4) != 0 ? null : str2);
        }
    }
}
