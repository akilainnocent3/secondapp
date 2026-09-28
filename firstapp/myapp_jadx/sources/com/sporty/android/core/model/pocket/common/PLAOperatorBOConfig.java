package com.sporty.android.core.model.pocket.common;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/PLAOperatorBOConfig;", "", "name", "", "address", "city", "province", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAddress", "getCity", "getProvince", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PLAOperatorBOConfig {
    private final String address;
    private final String city;
    private final String name;
    private final String province;

    public PLAOperatorBOConfig(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.name = str;
        this.address = str2;
        this.city = str3;
        this.province = str4;
    }

    public static /* synthetic */ PLAOperatorBOConfig copy$default(PLAOperatorBOConfig pLAOperatorBOConfig, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pLAOperatorBOConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = pLAOperatorBOConfig.address;
        }
        if ((i & 4) != 0) {
            str3 = pLAOperatorBOConfig.city;
        }
        if ((i & 8) != 0) {
            str4 = pLAOperatorBOConfig.province;
        }
        return pLAOperatorBOConfig.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    public final PLAOperatorBOConfig copy(String name, String address, String city, String province) {
        name.getClass();
        address.getClass();
        city.getClass();
        province.getClass();
        return new PLAOperatorBOConfig(name, address, city, province);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PLAOperatorBOConfig)) {
            return false;
        }
        PLAOperatorBOConfig pLAOperatorBOConfig = (PLAOperatorBOConfig) other;
        return Intrinsics.g(this.name, pLAOperatorBOConfig.name) && Intrinsics.g(this.address, pLAOperatorBOConfig.address) && Intrinsics.g(this.city, pLAOperatorBOConfig.city) && Intrinsics.g(this.province, pLAOperatorBOConfig.province);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProvince() {
        return this.province;
    }

    public int hashCode() {
        return this.province.hashCode() + gmf0.a(gmf0.a(this.name.hashCode() * 31, 31, this.address), 31, this.city);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.address;
        return kwi.a(ux5.a("PLAOperatorBOConfig(name=", str, ", address=", str2, ", city="), this.city, QWvyvNzGsBpRT.CySqBzwFujrXeq, this.province, ")");
    }
}
