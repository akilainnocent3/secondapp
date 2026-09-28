package com.sportybet.feature.gift.gift.presentation;

import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.uvk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public final uvk a;
    public final f b;
    public final f c;
    public final String d;
    public final String e;
    public final String f;
    public final c g;
    public final d h;
    public final int i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ i(f fVar, f fVar2, String str, int i) {
        this(uvk.a, (i & 2) != 0 ? f.a.a : fVar, (i & 4) != 0 ? f.a.a : fVar2, (i & 8) != 0 ? "" : str, null, null, c.b.a, d.c.a, (i & 256) != 0 ? 0 : 5, (i & 512) != 0 ? "0.00" : "1,000.00", (i & 1024) == 0, (i & 2048) == 0);
    }

    public static i a(i iVar, uvk uvkVar, f fVar, f fVar2, String str, String str2, String str3, c cVar, d dVar, int i, String str4, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            uvkVar = iVar.a;
        }
        uvk uvkVar2 = uvkVar;
        if ((i2 & 2) != 0) {
            fVar = iVar.b;
        }
        f fVar3 = fVar;
        f fVar4 = (i2 & 4) != 0 ? iVar.c : fVar2;
        String str5 = (i2 & 8) != 0 ? iVar.d : str;
        String str6 = (i2 & 16) != 0 ? iVar.e : str2;
        String str7 = (i2 & 32) != 0 ? iVar.f : str3;
        c cVar2 = (i2 & 64) != 0 ? iVar.g : cVar;
        d dVar2 = (i2 & 128) != 0 ? iVar.h : dVar;
        int i3 = (i2 & 256) != 0 ? iVar.i : i;
        String str8 = (i2 & 512) != 0 ? iVar.j : str4;
        boolean z3 = (i2 & 1024) != 0 ? iVar.k : z;
        boolean z4 = (i2 & 2048) != 0 ? iVar.l : z2;
        iVar.getClass();
        uvkVar2.getClass();
        fVar3.getClass();
        fVar4.getClass();
        str5.getClass();
        cVar2.getClass();
        dVar2.getClass();
        str8.getClass();
        return new i(uvkVar2, fVar3, fVar4, str5, str6, str7, cVar2, dVar2, i3, str8, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && Intrinsics.g(this.b, iVar.b) && Intrinsics.g(this.c, iVar.c) && Intrinsics.g(this.d, iVar.d) && Intrinsics.g(this.e, iVar.e) && Intrinsics.g(this.f, iVar.f) && Intrinsics.g(this.g, iVar.g) && Intrinsics.g(this.h, iVar.h) && this.i == iVar.i && Intrinsics.g(this.j, iVar.j) && this.k == iVar.k && this.l == iVar.l;
    }

    public final int hashCode() {
        int iA = gmf0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.l) + mtg0.a(gmf0.a(gpp.a(this.i, (this.h.hashCode() + ((this.g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftScreenUiState(selectedTab=");
        sb.append(this.a);
        sb.append(", validGiftsState=");
        sb.append(this.b);
        sb.append(", usedExpiredGiftsState=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", adText=");
        hxa.c(sb, this.e, ", depositUrl=", this.f, ", bottomSheetState=");
        sb.append(this.g);
        sb.append(", dialogState=");
        sb.append(this.h);
        sb.append(", validGiftCount=");
        f78.b(this.i, ", validGiftAmount=", this.j, ", hasMonetaryGifts=", sb);
        return lng.a(", isPreFtdMxUser=", ")", sb, this.k, this.l);
    }

    public i(uvk uvkVar, f fVar, f fVar2, String str, String str2, String str3, c cVar, d dVar, int i, String str4, boolean z, boolean z2) {
        uvkVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        str.getClass();
        cVar.getClass();
        dVar.getClass();
        str4.getClass();
        this.a = uvkVar;
        this.b = fVar;
        this.c = fVar2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = cVar;
        this.h = dVar;
        this.i = i;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = z2 && j.a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095);
    }
}
