package com.sportybet.feature.luckynumber.lobby.data.dto;

import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNCountryDTO;", "", "isoCode", "", "name", "flagUrl", "backgroundUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIsoCode", "()Ljava/lang/String;", "getName", "getFlagUrl", "getBackgroundUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNCountryDTO {
    public static final int $stable = 0;
    private final String backgroundUrl;
    private final String flagUrl;
    private final String isoCode;
    private final String name;

    public LNCountryDTO(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.isoCode = str;
        this.name = str2;
        this.flagUrl = str3;
        this.backgroundUrl = str4;
    }

    public static /* synthetic */ LNCountryDTO copy$default(LNCountryDTO lNCountryDTO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNCountryDTO.isoCode;
        }
        if ((i & 2) != 0) {
            str2 = lNCountryDTO.name;
        }
        if ((i & 4) != 0) {
            str3 = lNCountryDTO.flagUrl;
        }
        if ((i & 8) != 0) {
            str4 = lNCountryDTO.backgroundUrl;
        }
        return lNCountryDTO.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFlagUrl() {
        return this.flagUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final LNCountryDTO copy(String isoCode, String name, String flagUrl, String backgroundUrl) {
        isoCode.getClass();
        name.getClass();
        flagUrl.getClass();
        backgroundUrl.getClass();
        return new LNCountryDTO(isoCode, name, flagUrl, backgroundUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNCountryDTO)) {
            return false;
        }
        LNCountryDTO lNCountryDTO = (LNCountryDTO) other;
        return Intrinsics.g(this.isoCode, lNCountryDTO.isoCode) && Intrinsics.g(this.name, lNCountryDTO.name) && Intrinsics.g(this.flagUrl, lNCountryDTO.flagUrl) && Intrinsics.g(this.backgroundUrl, lNCountryDTO.backgroundUrl);
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final String getFlagUrl() {
        return this.flagUrl;
    }

    public final String getIsoCode() {
        return this.isoCode;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.backgroundUrl.hashCode() + gmf0.a(gmf0.a(this.isoCode.hashCode() * 31, 31, this.name), 31, this.flagUrl);
    }

    public String toString() {
        String str = this.isoCode;
        String str2 = this.name;
        return kwi.a(ux5.a("LNCountryDTO(isoCode=", str, ", name=", str2, ", flagUrl="), this.flagUrl, ", backgroundUrl=", this.backgroundUrl, ")");
    }
}
