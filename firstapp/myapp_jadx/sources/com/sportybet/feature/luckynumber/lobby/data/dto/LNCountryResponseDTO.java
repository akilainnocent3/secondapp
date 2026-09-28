package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.appsflyer.internal.p;
import defpackage.a4h;
import defpackage.jpu;
import defpackage.l48;
import defpackage.m2g;
import defpackage.scn;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCountryResponseDTO;", "", "", "Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCountryDTO;", "countries", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCountryResponseDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCountries", "Lscn;", "getCountryMap", "()Lscn;", "countryMap", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNCountryResponseDTO {
    public static final int $stable = 8;
    private final List<LNCountryDTO> countries;

    public LNCountryResponseDTO(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNCountryResponseDTO copy$default(LNCountryResponseDTO lNCountryResponseDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lNCountryResponseDTO.countries;
        }
        return lNCountryResponseDTO.copy(list);
    }

    public final List<LNCountryDTO> component1() {
        return this.countries;
    }

    public final LNCountryResponseDTO copy(List<LNCountryDTO> countries) {
        countries.getClass();
        return new LNCountryResponseDTO(countries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LNCountryResponseDTO) && Intrinsics.g(this.countries, ((LNCountryResponseDTO) other).countries);
    }

    public final List<LNCountryDTO> getCountries() {
        return this.countries;
    }

    public final scn<String, LNCountryDTO> getCountryMap() {
        List<LNCountryDTO> list = this.countries;
        int iA = jpu.a(l48.r(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(((LNCountryDTO) obj).getIsoCode(), obj);
        }
        return a4h.d(linkedHashMap);
    }

    public int hashCode() {
        return this.countries.hashCode();
    }

    public String toString() {
        return p.a("LNCountryResponseDTO(countries=", ")", this.countries);
    }

    public LNCountryResponseDTO(List<LNCountryDTO> list) {
        list.getClass();
        this.countries = list;
    }

    public LNCountryResponseDTO() {
        this(null, 1, null);
    }
}
