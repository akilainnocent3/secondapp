package com.sportybet.android.account.international.data.model;

import com.sportybet.repository.limits.model.SaveLimitsRequest;
import defpackage.ai50;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kya0;
import defpackage.m2g;
import defpackage.pe4;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.v9d;
import defpackage.xnu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030,J\u001a\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030.0\u000bH\u0002J\u001a\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030.0\u000bH\u0002J\u001a\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030.0\u000bH\u0002J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J\u0083\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0001J\u0014\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010?\u001a\u00020@HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0003HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&Ê\u0001\f\bC\u0012\b\bD\u0012\u0004\b\u0003\u0010\u0000¨\u0006B"}, d2 = {"Lcom/sportybet/android/account/international/data/model/INTRegisterRequest;", "", "email", "", "password", "countryCode", "currency", "language", "phoneCountryCode", "phone", "kycFields", "", "Lcom/sportybet/android/account/international/data/model/KycFieldRequest;", "userPreferences", "Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest;", "bettorLimits", "Lcom/sportybet/repository/limits/model/SaveLimitsRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getCountryCode", "setCountryCode", "getCurrency", "setCurrency", "getLanguage", "setLanguage", "getPhoneCountryCode", "setPhoneCountryCode", "getPhone", "setPhone", "getKycFields", "()Ljava/util/List;", "setKycFields", "(Ljava/util/List;)V", "getUserPreferences", "setUserPreferences", "getBettorLimits", "setBettorLimits", "toFormUrlEncodedMap", "", "buildBettorLimitsFormUrlParameters", "Lkotlin/Pair;", "buildKycFormUrlParameters", "buildUserPreferencesFormUrlParameters", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class INTRegisterRequest {
    public static final int $stable = 8;
    private List<SaveLimitsRequest> bettorLimits;
    private String countryCode;
    private String currency;
    private String email;
    private List<KycFieldRequest> kycFields;
    private String language;
    private String password;
    private String phone;
    private String phoneCountryCode;
    private List<UserPreferenceRequest> userPreferences;

    public INTRegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? m2g.a : list, (i & 256) != 0 ? m2g.a : list2, (i & 512) != 0 ? m2g.a : list3);
    }

    private final List<Pair<String, String>> buildBettorLimitsFormUrlParameters() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : this.bettorLimits) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            SaveLimitsRequest saveLimitsRequest = (SaveLimitsRequest) obj;
            String strB = pe4.b(i, "bettorLimits[", "]");
            arrayList.add(new Pair(strB.concat(".limitType"), String.valueOf(saveLimitsRequest.getLimitType())));
            Integer gameType = saveLimitsRequest.getGameType();
            if (gameType != null) {
                arrayList.add(new Pair(strB.concat(".gameType"), String.valueOf(gameType.intValue())));
            }
            Integer monthlyLimit = saveLimitsRequest.getMonthlyLimit();
            if (monthlyLimit != null) {
                arrayList.add(new Pair(strB.concat(".monthlyLimit"), String.valueOf(monthlyLimit.intValue())));
            }
            Integer weeklyLimit = saveLimitsRequest.getWeeklyLimit();
            if (weeklyLimit != null) {
                arrayList.add(new Pair(strB.concat(".weeklyLimit"), String.valueOf(weeklyLimit.intValue())));
            }
            Integer dailyLimit = saveLimitsRequest.getDailyLimit();
            if (dailyLimit != null) {
                arrayList.add(new Pair(strB.concat(".dailyLimit"), String.valueOf(dailyLimit.intValue())));
            }
            i = i2;
        }
        return arrayList;
    }

    private final List<Pair<String, String>> buildKycFormUrlParameters() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : this.kycFields) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.addAll(((KycFieldRequest) obj).toFormUrlEncodedMap(i));
            i = i2;
        }
        return arrayList;
    }

    private final List<Pair<String, String>> buildUserPreferencesFormUrlParameters() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : this.userPreferences) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            arrayList.addAll(((UserPreferenceRequest) obj).toFormUrlEncodedMap(i));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ INTRegisterRequest copy$default(INTRegisterRequest iNTRegisterRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iNTRegisterRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = iNTRegisterRequest.password;
        }
        if ((i & 4) != 0) {
            str3 = iNTRegisterRequest.countryCode;
        }
        if ((i & 8) != 0) {
            str4 = iNTRegisterRequest.currency;
        }
        if ((i & 16) != 0) {
            str5 = iNTRegisterRequest.language;
        }
        if ((i & 32) != 0) {
            str6 = iNTRegisterRequest.phoneCountryCode;
        }
        if ((i & 64) != 0) {
            str7 = iNTRegisterRequest.phone;
        }
        if ((i & 128) != 0) {
            list = iNTRegisterRequest.kycFields;
        }
        if ((i & 256) != 0) {
            list2 = iNTRegisterRequest.userPreferences;
        }
        if ((i & 512) != 0) {
            list3 = iNTRegisterRequest.bettorLimits;
        }
        List list4 = list2;
        List list5 = list3;
        String str8 = str7;
        List list6 = list;
        String str9 = str5;
        String str10 = str6;
        return iNTRegisterRequest.copy(str, str2, str3, str4, str9, str10, str8, list6, list4, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final List<SaveLimitsRequest> component10() {
        return this.bettorLimits;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final List<KycFieldRequest> component8() {
        return this.kycFields;
    }

    public final List<UserPreferenceRequest> component9() {
        return this.userPreferences;
    }

    public final INTRegisterRequest copy(String email, String password, String countryCode, String currency, String language, String phoneCountryCode, String phone, List<KycFieldRequest> kycFields, List<UserPreferenceRequest> userPreferences, List<SaveLimitsRequest> bettorLimits) {
        qn4.b(email, password, countryCode, currency, language);
        kycFields.getClass();
        userPreferences.getClass();
        bettorLimits.getClass();
        return new INTRegisterRequest(email, password, countryCode, currency, language, phoneCountryCode, phone, kycFields, userPreferences, bettorLimits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof INTRegisterRequest)) {
            return false;
        }
        INTRegisterRequest iNTRegisterRequest = (INTRegisterRequest) other;
        return Intrinsics.g(this.email, iNTRegisterRequest.email) && Intrinsics.g(this.password, iNTRegisterRequest.password) && Intrinsics.g(this.countryCode, iNTRegisterRequest.countryCode) && Intrinsics.g(this.currency, iNTRegisterRequest.currency) && Intrinsics.g(this.language, iNTRegisterRequest.language) && Intrinsics.g(this.phoneCountryCode, iNTRegisterRequest.phoneCountryCode) && Intrinsics.g(this.phone, iNTRegisterRequest.phone) && Intrinsics.g(this.kycFields, iNTRegisterRequest.kycFields) && Intrinsics.g(this.userPreferences, iNTRegisterRequest.userPreferences) && Intrinsics.g(this.bettorLimits, iNTRegisterRequest.bettorLimits);
    }

    public final List<SaveLimitsRequest> getBettorLimits() {
        return this.bettorLimits;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<KycFieldRequest> getKycFields() {
        return this.kycFields;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final List<UserPreferenceRequest> getUserPreferences() {
        return this.userPreferences;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.email.hashCode() * 31, 31, this.password), 31, this.countryCode), 31, this.currency), 31, this.language);
        String str = this.phoneCountryCode;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return this.bettorLimits.hashCode() + ai50.a(ai50.a((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.kycFields), 31, this.userPreferences);
    }

    public final void setBettorLimits(List<SaveLimitsRequest> list) {
        list.getClass();
        this.bettorLimits = list;
    }

    public final void setCountryCode(String str) {
        str.getClass();
        this.countryCode = str;
    }

    public final void setCurrency(String str) {
        str.getClass();
        this.currency = str;
    }

    public final void setEmail(String str) {
        str.getClass();
        this.email = str;
    }

    public final void setKycFields(List<KycFieldRequest> list) {
        list.getClass();
        this.kycFields = list;
    }

    public final void setLanguage(String str) {
        str.getClass();
        this.language = str;
    }

    public final void setPassword(String str) {
        str.getClass();
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneCountryCode(String str) {
        this.phoneCountryCode = str;
    }

    public final void setUserPreferences(List<UserPreferenceRequest> list) {
        list.getClass();
        this.userPreferences = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, String> toFormUrlEncodedMap() {
        xnu xnuVar = new xnu();
        xnuVar.put("email", this.email);
        xnuVar.put("password", this.password);
        xnuVar.put("countryCode", this.countryCode);
        xnuVar.put("language", this.language);
        xnuVar.put("currency", this.currency);
        Iterator<T> it = buildBettorLimitsFormUrlParameters().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            xnuVar.put((String) pair.a, (String) pair.b);
        }
        String str = this.phoneCountryCode;
        if (str != null) {
        }
        String str2 = this.phone;
        if (str2 != null) {
        }
        Iterator<T> it2 = buildKycFormUrlParameters().iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            xnuVar.put((String) pair2.a, (String) pair2.b);
        }
        Iterator<T> it3 = buildUserPreferencesFormUrlParameters().iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            xnuVar.put((String) pair3.a, (String) pair3.b);
        }
        return xnuVar.c();
    }

    public String toString() {
        String str = this.email;
        String str2 = this.password;
        String str3 = this.countryCode;
        String str4 = this.currency;
        String str5 = this.language;
        String str6 = this.phoneCountryCode;
        String str7 = this.phone;
        List<KycFieldRequest> list = this.kycFields;
        List<UserPreferenceRequest> list2 = this.userPreferences;
        List<SaveLimitsRequest> list3 = this.bettorLimits;
        StringBuilder sbA = ux5.a("INTRegisterRequest(email=", str, ", password=", str2, ", countryCode=");
        hxa.c(sbA, str3, ", currency=", str4, ", language=");
        hxa.c(sbA, str5, ", phoneCountryCode=", str6, ", phone=");
        kya0.b(str7, ", kycFields=", ", userPreferences=", sbA, list);
        return v9d.a(", bettorLimits=", ")", sbA, list2, list3);
    }

    public INTRegisterRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<KycFieldRequest> list, List<UserPreferenceRequest> list2, List<SaveLimitsRequest> list3) {
        qn4.b(str, str2, str3, str4, str5);
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.email = str;
        this.password = str2;
        this.countryCode = str3;
        this.currency = str4;
        this.language = str5;
        this.phoneCountryCode = str6;
        this.phone = str7;
        this.kycFields = list;
        this.userPreferences = list2;
        this.bettorLimits = list3;
    }

    public INTRegisterRequest() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
