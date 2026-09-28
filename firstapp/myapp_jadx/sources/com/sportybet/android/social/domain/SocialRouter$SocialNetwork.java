package com.sportybet.android.social.domain;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.entity.SocialMineType;
import defpackage.djx;
import defpackage.eal;
import defpackage.ffx;
import defpackage.gfx;
import defpackage.nex;
import defpackage.ohx;
import defpackage.rfa0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SocialRouter$SocialNetwork implements ohx {
    public static final SocialRouter$SocialNetwork a = new SocialRouter$SocialNetwork();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, d2 = {"Lcom/sportybet/android/social/domain/SocialRouter$SocialNetwork$Data;", "Landroid/os/Parcelable;", "", "username", "Lcom/sporty/android/core/model/service/CountryCodeName;", "countryCode", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "mineType", "Lrfa0;", "networkType", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sportybet/android/social/domain/entity/SocialMineType;Lrfa0;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sporty/android/core/model/service/CountryCodeName;", "component3", "()Lcom/sportybet/android/social/domain/entity/SocialMineType;", "component4", "()Lrfa0;", "copy", "(Ljava/lang/String;Lcom/sporty/android/core/model/service/CountryCodeName;Lcom/sportybet/android/social/domain/entity/SocialMineType;Lrfa0;)Lcom/sportybet/android/social/domain/SocialRouter$SocialNetwork$Data;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUsername", "Lcom/sporty/android/core/model/service/CountryCodeName;", "getCountryCode", "Lcom/sportybet/android/social/domain/entity/SocialMineType;", "getMineType", "Lrfa0;", "getNetworkType", "Companion", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {
        public static final int $stable = 8;
        private final CountryCodeName countryCode;
        private final SocialMineType mineType;
        private final rfa0 networkType;
        private final String username;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Parcelable.Creator<Data> CREATOR = new b();
        private static final Data EMPTY = new Data("", null, SocialMineType.INVALID, rfa0.a);

        /* JADX INFO: renamed from: com.sportybet.android.social.domain.SocialRouter$SocialNetwork$Data$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        public static final class b implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Data(parcel.readString(), parcel.readInt() == 0 ? null : CountryCodeName.valueOf(parcel.readString()), SocialMineType.CREATOR.createFromParcel(parcel), rfa0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(String str, CountryCodeName countryCodeName, SocialMineType socialMineType, rfa0 rfa0Var) {
            str.getClass();
            socialMineType.getClass();
            rfa0Var.getClass();
            this.username = str;
            this.countryCode = countryCodeName;
            this.mineType = socialMineType;
            this.networkType = rfa0Var;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, CountryCodeName countryCodeName, SocialMineType socialMineType, rfa0 rfa0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.username;
            }
            if ((i & 2) != 0) {
                countryCodeName = data.countryCode;
            }
            if ((i & 4) != 0) {
                socialMineType = data.mineType;
            }
            if ((i & 8) != 0) {
                rfa0Var = data.networkType;
            }
            return data.copy(str, countryCodeName, socialMineType, rfa0Var);
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
        public final SocialMineType getMineType() {
            return this.mineType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final rfa0 getNetworkType() {
            return this.networkType;
        }

        public final Data copy(String username, CountryCodeName countryCode, SocialMineType mineType, rfa0 networkType) {
            username.getClass();
            mineType.getClass();
            networkType.getClass();
            return new Data(username, countryCode, mineType, networkType);
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
            return Intrinsics.g(this.username, data.username) && this.countryCode == data.countryCode && this.mineType == data.mineType && this.networkType == data.networkType;
        }

        public final CountryCodeName getCountryCode() {
            return this.countryCode;
        }

        public final SocialMineType getMineType() {
            return this.mineType;
        }

        public final rfa0 getNetworkType() {
            return this.networkType;
        }

        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iHashCode = this.username.hashCode() * 31;
            CountryCodeName countryCodeName = this.countryCode;
            return this.networkType.hashCode() + ((this.mineType.hashCode() + ((iHashCode + (countryCodeName == null ? 0 : countryCodeName.hashCode())) * 31)) * 31);
        }

        public String toString() {
            return "Data(username=" + this.username + ", countryCode=" + this.countryCode + ", mineType=" + this.mineType + ", networkType=" + this.networkType + ")";
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
            this.mineType.writeToParcel(dest, flags);
            dest.writeString(this.networkType.name());
        }
    }

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
        return kotlin.collections.a.c(new nex("arg_social_network_data", aVar2.a()));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SocialRouter$SocialNetwork);
    }

    public final int hashCode() {
        return 862017600;
    }

    public final String toString() {
        return "SocialNetwork";
    }
}
