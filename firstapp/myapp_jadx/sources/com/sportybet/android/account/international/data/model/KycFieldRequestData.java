package com.sportybet.android.account.international.data.model;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import defpackage.c5j0;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.pe4;
import defpackage.tug;
import defpackage.tx5;
import defpackage.ux5;
import defpackage.wd7;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "", "<init>", "()V", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "", "index", "", "CPFRequestData", "DateOfBirthRequestData", "NameRequestData", "AddressRequestData", "CountryCodeRequestData", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$AddressRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$CPFRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$CountryCodeRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$DateOfBirthRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$NameRequestData;", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class KycFieldRequestData {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$AddressRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "address", "", "postalCode", "city", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getPostalCode", "getCity", "getState", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AddressRequestData extends KycFieldRequestData {
        public static final int $stable = 0;
        private final String address;
        private final String city;
        private final String postalCode;
        private final String state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressRequestData(String str, String str2, String str3, String str4) {
            super(null);
            wd7.a(str, str2, str3, str4);
            this.address = str;
            this.postalCode = str2;
            this.city = str3;
            this.state = str4;
        }

        public static /* synthetic */ AddressRequestData copy$default(AddressRequestData addressRequestData, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressRequestData.address;
            }
            if ((i & 2) != 0) {
                str2 = addressRequestData.postalCode;
            }
            if ((i & 4) != 0) {
                str3 = addressRequestData.city;
            }
            if ((i & 8) != 0) {
                str4 = addressRequestData.state;
            }
            return addressRequestData.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final AddressRequestData copy(String address, String postalCode, String city, String state) {
            address.getClass();
            postalCode.getClass();
            city.getClass();
            state.getClass();
            return new AddressRequestData(address, postalCode, city, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressRequestData)) {
                return false;
            }
            AddressRequestData addressRequestData = (AddressRequestData) other;
            return Intrinsics.g(this.address, addressRequestData.address) && Intrinsics.g(this.postalCode, addressRequestData.postalCode) && Intrinsics.g(this.city, addressRequestData.city) && Intrinsics.g(this.state, addressRequestData.state);
        }

        public final String getAddress() {
            return this.address;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode() + gmf0.a(gmf0.a(this.address.hashCode() * 31, 31, this.postalCode), 31, this.city);
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public boolean isEmpty() {
            return this.address.length() == 0 || this.postalCode.length() == 0 || this.state.length() == 0;
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public List<Pair<String, String>> toFormUrlEncodedMap(int index) {
            return b.k(new Pair(pe4.b(index, "kyc[", "].data.address"), this.address), new Pair(pe4.b(index, "kyc[", "].data.postalCode"), this.postalCode), new Pair(pe4.b(index, "kyc[", "].data.state"), this.state), new Pair(pe4.b(index, "kyc[", "].data.city"), this.city));
        }

        public String toString() {
            String str = this.address;
            String str2 = this.postalCode;
            return kwi.a(ux5.a("AddressRequestData(address=", str, ", postalCode=", str2, ", city="), this.city, ", state=", this.state, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$CPFRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "cpf", "", "<init>", "(Ljava/lang/String;)V", "getCpf", "()Ljava/lang/String;", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CPFRequestData extends KycFieldRequestData {
        public static final int $stable = 0;
        private final String cpf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CPFRequestData(String str) {
            super(null);
            str.getClass();
            this.cpf = str;
        }

        public static /* synthetic */ CPFRequestData copy$default(CPFRequestData cPFRequestData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cPFRequestData.cpf;
            }
            return cPFRequestData.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCpf() {
            return this.cpf;
        }

        public final CPFRequestData copy(String cpf) {
            cpf.getClass();
            return new CPFRequestData(cpf);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CPFRequestData) && Intrinsics.g(this.cpf, ((CPFRequestData) other).cpf);
        }

        public final String getCpf() {
            return this.cpf;
        }

        public int hashCode() {
            return this.cpf.hashCode();
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public boolean isEmpty() {
            return this.cpf.length() == 0;
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public List<Pair<String, String>> toFormUrlEncodedMap(int index) {
            return c5j0.a(pe4.b(index, "kyc[", "].data.cpf"), this.cpf);
        }

        public String toString() {
            return tug.a("CPFRequestData(cpf=", this.cpf, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$CountryCodeRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "countryCode", "", "<init>", "(Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CountryCodeRequestData extends KycFieldRequestData {
        public static final int $stable = 0;
        private final String countryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountryCodeRequestData(String str) {
            super(null);
            str.getClass();
            this.countryCode = str;
        }

        public static /* synthetic */ CountryCodeRequestData copy$default(CountryCodeRequestData countryCodeRequestData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = countryCodeRequestData.countryCode;
            }
            return countryCodeRequestData.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final CountryCodeRequestData copy(String countryCode) {
            countryCode.getClass();
            return new CountryCodeRequestData(countryCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CountryCodeRequestData) && Intrinsics.g(this.countryCode, ((CountryCodeRequestData) other).countryCode);
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            return this.countryCode.hashCode();
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public boolean isEmpty() {
            return this.countryCode.length() == 0;
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public List<Pair<String, String>> toFormUrlEncodedMap(int index) {
            String strB = pe4.b(index, "kyc[", "].data.country");
            String upperCase = this.countryCode.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return a.c(new Pair(strB, upperCase));
        }

        public String toString() {
            return tug.a(jbkEboCkTqmGf.HthEwWfTxoHA, this.countryCode, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$DateOfBirthRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "dob", "", "<init>", "(Ljava/lang/String;)V", "getDob", "()Ljava/lang/String;", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DateOfBirthRequestData extends KycFieldRequestData {
        public static final int $stable = 0;
        private final String dob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateOfBirthRequestData(String str) {
            super(null);
            str.getClass();
            this.dob = str;
        }

        public static /* synthetic */ DateOfBirthRequestData copy$default(DateOfBirthRequestData dateOfBirthRequestData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dateOfBirthRequestData.dob;
            }
            return dateOfBirthRequestData.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDob() {
            return this.dob;
        }

        public final DateOfBirthRequestData copy(String dob) {
            dob.getClass();
            return new DateOfBirthRequestData(dob);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DateOfBirthRequestData) && Intrinsics.g(this.dob, ((DateOfBirthRequestData) other).dob);
        }

        public final String getDob() {
            return this.dob;
        }

        public int hashCode() {
            return this.dob.hashCode();
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public boolean isEmpty() {
            return this.dob.length() == 0;
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public List<Pair<String, String>> toFormUrlEncodedMap(int index) {
            return c5j0.a(pe4.b(index, "kyc[", "].data.dob"), this.dob);
        }

        public String toString() {
            return tug.a("DateOfBirthRequestData(dob=", this.dob, ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequestData$NameRequestData;", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "firstName", "", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "isEmpty", "", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NameRequestData extends KycFieldRequestData {
        public static final int $stable = 0;
        private final String firstName;
        private final String lastName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameRequestData(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.firstName = str;
            this.lastName = str2;
        }

        public static /* synthetic */ NameRequestData copy$default(NameRequestData nameRequestData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nameRequestData.firstName;
            }
            if ((i & 2) != 0) {
                str2 = nameRequestData.lastName;
            }
            return nameRequestData.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        public final NameRequestData copy(String firstName, String lastName) {
            firstName.getClass();
            lastName.getClass();
            return new NameRequestData(firstName, lastName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NameRequestData)) {
                return false;
            }
            NameRequestData nameRequestData = (NameRequestData) other;
            return Intrinsics.g(this.firstName, nameRequestData.firstName) && Intrinsics.g(this.lastName, nameRequestData.lastName);
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public int hashCode() {
            return this.lastName.hashCode() + (this.firstName.hashCode() * 31);
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public boolean isEmpty() {
            return this.firstName.length() == 0 || this.lastName.length() == 0;
        }

        @Override // com.sportybet.android.account.international.data.model.KycFieldRequestData
        public List<Pair<String, String>> toFormUrlEncodedMap(int index) {
            return b.k(new Pair(pe4.b(index, "kyc[", "].data.firstName"), this.firstName), new Pair(pe4.b(index, "kyc[", "].data.lastName"), this.lastName));
        }

        public String toString() {
            return tx5.a(siPCzPFw.FSIZeBVI, this.firstName, ", lastName=", this.lastName, ")");
        }
    }

    public /* synthetic */ KycFieldRequestData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isEmpty();

    public abstract List<Pair<String, String>> toFormUrlEncodedMap(int index);

    private KycFieldRequestData() {
    }
}
