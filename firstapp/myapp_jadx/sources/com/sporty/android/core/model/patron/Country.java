package com.sporty.android.core.model.patron;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/patron/Country;", "", EventKeys.ERROR_CODE, "", "name", AnalyticsParam.HOME_NAV_ICON, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Country {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Country MOZAMBIQUE;
    private final String code;
    private final String icon;
    private final String name;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/patron/Country$Companion;", "", "<init>", "()V", "MOZAMBIQUE", "Lcom/sporty/android/core/model/patron/Country;", "getMOZAMBIQUE", "()Lcom/sporty/android/core/model/patron/Country;", "getCountryFlag", "", "countryCodeName", "Lcom/sporty/android/core/model/service/CountryCodeName;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getCountryFlag(CountryCodeName countryCodeName) {
            String upperCase = countryCodeName.getCode().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return "https://s.sporty.net/sportycom/countryFlagIcon/" + upperCase;
        }

        public final Country getMOZAMBIQUE() {
            return Country.MOZAMBIQUE;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        MOZAMBIQUE = new Country("MZ", "Mozambique", companion.getCountryFlag(CountryCodeName.MOZAMBIQUE));
    }

    public Country(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.code = str;
        this.name = str2;
        this.icon = str3;
    }

    public static /* synthetic */ Country copy$default(Country country, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = country.code;
        }
        if ((i & 2) != 0) {
            str2 = country.name;
        }
        if ((i & 4) != 0) {
            str3 = country.icon;
        }
        return country.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final Country copy(String code, String name, String icon) {
        code.getClass();
        name.getClass();
        icon.getClass();
        return new Country(code, name, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.g(this.code, country.code) && Intrinsics.g(this.name, country.name) && Intrinsics.g(this.icon, country.icon);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.icon.hashCode() + gmf0.a(this.code.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.name;
        return uf80.a(ux5.a("Country(code=", str, ", name=", str2, ", icon="), this.icon, ")");
    }
}
