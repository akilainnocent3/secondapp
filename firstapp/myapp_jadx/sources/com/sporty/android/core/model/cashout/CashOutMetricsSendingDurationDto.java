package com.sporty.android.core.model.cashout;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutMetricsSendingDurationDto;", "", "countries", "", "Lcom/sporty/android/core/model/cashout/CashOutMetricsSendingDurationDto$ByCountry;", "<init>", "(Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ByCountry", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CashOutMetricsSendingDurationDto {
    private final List<ByCountry> countries;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/cashout/CashOutMetricsSendingDurationDto$ByCountry;", "", "country", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getCountry", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/sporty/android/core/model/cashout/CashOutMetricsSendingDurationDto$ByCountry;", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ByCountry {
        private final String country;
        private final Long value;

        public ByCountry(String str, Long l) {
            this.country = str;
            this.value = l;
        }

        public static /* synthetic */ ByCountry copy$default(ByCountry byCountry, String str, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = byCountry.country;
            }
            if ((i & 2) != 0) {
                l = byCountry.value;
            }
            return byCountry.copy(str, l);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getValue() {
            return this.value;
        }

        public final ByCountry copy(String country, Long value) {
            return new ByCountry(country, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ByCountry)) {
                return false;
            }
            ByCountry byCountry = (ByCountry) other;
            return Intrinsics.g(this.country, byCountry.country) && Intrinsics.g(this.value, byCountry.value);
        }

        public final String getCountry() {
            return this.country;
        }

        public final Long getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.country;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.value;
            return iHashCode + (l != null ? l.hashCode() : 0);
        }

        public String toString() {
            return "ByCountry(country=" + this.country + ", value=" + this.value + ")";
        }
    }

    public CashOutMetricsSendingDurationDto(List<ByCountry> list) {
        this.countries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashOutMetricsSendingDurationDto copy$default(CashOutMetricsSendingDurationDto cashOutMetricsSendingDurationDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cashOutMetricsSendingDurationDto.countries;
        }
        return cashOutMetricsSendingDurationDto.copy(list);
    }

    public final List<ByCountry> component1() {
        return this.countries;
    }

    public final CashOutMetricsSendingDurationDto copy(List<ByCountry> countries) {
        return new CashOutMetricsSendingDurationDto(countries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CashOutMetricsSendingDurationDto) && Intrinsics.g(this.countries, ((CashOutMetricsSendingDurationDto) other).countries);
    }

    public final List<ByCountry> getCountries() {
        return this.countries;
    }

    public int hashCode() {
        List<ByCountry> list = this.countries;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("CashOutMetricsSendingDurationDto(countries=", ")", this.countries);
    }
}
