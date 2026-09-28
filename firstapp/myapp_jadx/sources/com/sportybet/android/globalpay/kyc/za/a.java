package com.sportybet.android.globalpay.kyc.za;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.d;
import com.sporty.android.core.model.patron.RejectReason;
import com.sportybet.android.globalpay.kyc.za.a;
import com.sportybet.android.globalpay.kyc.za.b;
import com.sportybet.android.gp.tz.R;
import defpackage.aiv;
import defpackage.alb0;
import defpackage.b160;
import defpackage.c68;
import defpackage.cb40;
import defpackage.crz;
import defpackage.d160;
import defpackage.e2a;
import defpackage.erz;
import defpackage.f30;
import defpackage.fi30;
import defpackage.g75;
import defpackage.g78;
import defpackage.gdf0;
import defpackage.gf4;
import defpackage.h9n;
import defpackage.hhq;
import defpackage.hjg;
import defpackage.hlh0;
import defpackage.hnw;
import defpackage.ht;
import defpackage.i78;
import defpackage.igf0;
import defpackage.ivb0;
import defpackage.ki30;
import defpackage.kw0;
import defpackage.lkf0;
import defpackage.mla;
import defpackage.n30;
import defpackage.n54;
import defpackage.ne00;
import defpackage.nj5;
import defpackage.nwu;
import defpackage.op8;
import defpackage.oxc;
import defpackage.sya;
import defpackage.tsr;
import defpackage.uhc;
import defpackage.wae;
import defpackage.xya;
import defpackage.yka;
import defpackage.zk40;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/globalpay/kyc/za/a;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends d {
    public InterfaceC0227a a;

    /* JADX INFO: renamed from: com.sportybet.android.globalpay.kyc.za.a$a, reason: collision with other inner class name */
    public interface InterfaceC0227a {
        void a(wae waeVar);
    }

    public final void j0(final b bVar, androidx.compose.runtime.a aVar, final int i) throws Exception {
        boolean z;
        int i2;
        final a aVar2 = this;
        androidx.compose.runtime.b bVarI = aVar.i(-2035763182);
        int i3 = i | (bVarI.d(bVar.ordinal()) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= bVarI.A(aVar2) ? 32 : 16;
        }
        int i4 = 1;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = bVar.ordinal();
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            n54 n54Var = ht.a.e;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (iOrdinal == 0) {
                bVarI.N(1812432736);
                androidx.compose.ui.d dVarJ = h.j(j.g(aVar3, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                String strA = cb40.a(R.string.identity_verification__submit_id_documents, new Object[0], bVarI);
                boolean zA = bVarI.A(aVar2);
                Object objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new fi30(aVar2, i4);
                    bVarI.r(objY);
                }
                aVar2 = this;
                xya.a(dVarJ, false, strA, null, null, null, null, null, null, (Function0) objY, bVarI, 6, 506);
                androidx.compose.ui.d dVarJ2 = h.j(j.i(j.g(aVar3, 1.0f), 58.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                boolean zA2 = bVarI.A(aVar2);
                Object objY2 = bVarI.y();
                if (zA2 || objY2 == c0042a) {
                    objY2 = new hhq(aVar2, 2);
                    bVarI.r(objY2);
                }
                androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarJ2, false, null, null, (Function0) objY2, 15);
                aiv aivVarC = g75.c(n54Var, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = c.c(bVarI, dVarD);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar3 = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar3);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                androidx.compose.ui.d dVarC2 = c.c(bVarI, aVar3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar3);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                h9n.a(erz.a(R.drawable.spr_ic_keyboard_arrow_left_black_24dp, 0, bVarI), null, null, null, null, 0.0f, new gf4(c68.a(R.color.brand_secondary, bVarI), 5), bVarI, 48, 60);
                lkf0.d(cb40.a(R.string.identity_verification__back_to_home_page, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                bVarI = bVarI;
                f30.a(bVarI, true, true, false);
                Unit unit = Unit.a;
            } else if (iOrdinal == 1) {
                bVarI.N(1814219390);
                androidx.compose.ui.d dVarJ3 = h.j(j.g(aVar3, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                String strA2 = cb40.a(R.string.identity_verification__resubmit_id_documents, new Object[0], bVarI);
                boolean zA3 = bVarI.A(aVar2);
                Object objY3 = bVarI.y();
                if (zA3 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: s9k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            a aVar5 = this.a;
                            a.InterfaceC0227a interfaceC0227a = aVar5.a;
                            if (interfaceC0227a != null) {
                                interfaceC0227a.a(wae.KYC);
                            }
                            aVar5.dismiss();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                xya.a(dVarJ3, false, strA2, null, null, null, null, null, null, (Function0) objY3, bVarI, 6, 506);
                androidx.compose.ui.d dVarJ4 = h.j(j.i(j.g(aVar3, 1.0f), 58.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                aVar2 = this;
                boolean zA4 = bVarI.A(aVar2);
                Object objY4 = bVarI.y();
                if (zA4 || objY4 == c0042a) {
                    z = true;
                    objY4 = new ivb0(aVar2, 1 == true ? 1 : 0);
                    bVarI.r(objY4);
                } else {
                    z = true;
                }
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.d.d(dVarJ4, false, null, null, (Function0) objY4, 15);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                androidx.compose.ui.d dVarC3 = c.c(bVarI, dVarD2);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar4 = yka.a.f;
                hlh0.a(bVarI, aivVarC2, bVar4);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS3, dVar2);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
                }
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC3, cVar2);
                d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 48);
                int iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC4 = c.c(bVarI, aVar3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar4);
                hlh0.a(bVarI, ne00VarS4, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, cVar2);
                h9n.a(erz.a(R.drawable.spr_ic_keyboard_arrow_left_black_24dp, 0, bVarI), null, null, null, null, 0.0f, new gf4(c68.a(R.color.brand_secondary, bVarI), 5), bVarI, 48, 60);
                lkf0.d(cb40.a(R.string.identity_verification__back_to_home_page, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                bVarI = bVarI;
                f30.a(bVarI, z, z, false);
                Unit unit2 = Unit.a;
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                bVarI.N(1816062681);
                androidx.compose.ui.d dVarJ5 = h.j(j.g(aVar3, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                String strA3 = cb40.a(R.string.identity_verification__back_to_home_page, new Object[0], bVarI);
                alb0 alb0VarA = alb0.a(sya.a, null, null, 0L, 2.0f, 15);
                boolean zA5 = bVarI.A(aVar2);
                Object objY5 = bVarI.y();
                if (zA5 || objY5 == c0042a) {
                    objY5 = new ki30(aVar2, 1);
                    bVarI.r(objY5);
                }
                xya.a(dVarJ5, false, strA3, null, alb0VarA, null, null, e2a.a, null, (Function0) objY5, bVarI, 12582918, 362);
                bVarI.X(false);
                Unit unit3 = Unit.a;
            } else {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw igf0.a(bVarI, 2136677399, false);
                    }
                    bVarI.N(2136863544);
                    bVarI.X(false);
                    throw new Exception("Unexpected KycStatusReminder = " + b.a);
                }
                bVarI.N(1817034531);
                androidx.compose.ui.d dVarJ6 = h.j(j.g(aVar3, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13);
                String strA4 = cb40.a(R.string.identity_verification__submit_id_documents, new Object[0], bVarI);
                boolean zA6 = bVarI.A(aVar2);
                Object objY6 = bVarI.y();
                if (zA6 || objY6 == c0042a) {
                    objY6 = new nwu(aVar2, 2);
                    bVarI.r(objY6);
                }
                xya.a(dVarJ6, false, strA4, null, null, null, null, null, null, (Function0) objY6, bVarI, 6, 506);
                androidx.compose.ui.d dVarJ7 = h.j(j.i(j.g(aVar3, 1.0f), 58.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                aVar2 = this;
                boolean zA7 = bVarI.A(aVar2);
                Object objY7 = bVarI.y();
                if (zA7 || objY7 == c0042a) {
                    i2 = 3;
                    objY7 = new hjg(aVar2, i2);
                    bVarI.r(objY7);
                } else {
                    i2 = 3;
                }
                androidx.compose.ui.d dVarD3 = androidx.compose.foundation.d.d(dVarJ7, false, null, null, (Function0) objY7, 15);
                aiv aivVarC3 = g75.c(n54Var, false);
                int iHashCode5 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                androidx.compose.ui.d dVarC5 = c.c(bVarI, dVarD3);
                yka.k.getClass();
                tsr.a aVar6 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, yka.a.f);
                hlh0.a(bVarI, ne00VarS5, yka.a.e);
                yka.a.C1350a c1350a3 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
                }
                hlh0.a(bVarI, dVarC5, yka.a.d);
                lkf0.d(cb40.a(R.string.page_login__submit_later, new Object[0], bVarI), null, c68.a(R.color.brand_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 0, 130042);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(false);
                Unit unit4 = Unit.a;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t9k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Exception {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.j0(bVar, (androidx.compose.runtime.a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0296  */
    /* JADX WARN: Code duplicated, block: B:102:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:110:0x030d  */
    /* JADX WARN: Code duplicated, block: B:113:0x031e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0353  */
    /* JADX WARN: Code duplicated, block: B:118:0x0357  */
    /* JADX WARN: Code duplicated, block: B:121:0x0364  */
    /* JADX WARN: Code duplicated, block: B:123:0x0372  */
    /* JADX WARN: Code duplicated, block: B:126:0x037a  */
    /* JADX WARN: Code duplicated, block: B:127:0x038a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0449  */
    /* JADX WARN: Code duplicated, block: B:132:0x0452  */
    /* JADX WARN: Code duplicated, block: B:134:0x0458  */
    /* JADX WARN: Code duplicated, block: B:135:0x045b  */
    /* JADX WARN: Code duplicated, block: B:137:0x045f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0467  */
    /* JADX WARN: Code duplicated, block: B:142:0x046b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0476  */
    /* JADX WARN: Code duplicated, block: B:145:0x0489 A[LOOP:1: B:144:0x0487->B:145:0x0489, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0523  */
    /* JADX WARN: Code duplicated, block: B:153:0x0531  */
    /* JADX WARN: Code duplicated, block: B:162:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0248 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x024e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0250  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x0275  */
    /* JADX WARN: Code duplicated, block: B:99:0x0281  */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x0449, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0258, please report this as an issue */
    public final void m0(b bVar, final Parcelable[] parcelableArr, androidx.compose.runtime.a aVar, final int i) throws Exception {
        final b bVar2;
        androidx.compose.runtime.b bVar3;
        final a aVar2;
        String strA;
        String strA2;
        String str;
        int iOrdinal;
        String str2;
        androidx.compose.ui.d.a aVar3;
        int iHashCode;
        tsr.a aVar4;
        yka.a.C1350a c1350a;
        Integer num;
        int iHashCode2;
        float f;
        int i2;
        float f2;
        androidx.compose.runtime.b bVar4;
        ArrayList arrayList;
        int size;
        int i3;
        androidx.compose.runtime.b bVar5;
        boolean z;
        androidx.compose.runtime.b bVar6;
        int i4;
        androidx.compose.runtime.b bVar7;
        androidx.compose.runtime.b bVar8;
        androidx.compose.runtime.b bVar9;
        ArrayList arrayList2;
        int i5;
        RejectReason rejectReason;
        String strA3;
        String strA4;
        a aVar5 = this;
        androidx.compose.runtime.b bVarI = aVar.i(-1714910108);
        int i6 = (bVarI.d(bVar.ordinal()) ? 4 : 2) | i | (bVarI.A(parcelableArr) ? 32 : 16) | (bVarI.A(aVar5) ? 256 : 128);
        if (bVarI.q(i6 & 1, (i6 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(R.drawable.documents_under_review);
            int iOrdinal2 = bVar.ordinal();
            if (iOrdinal2 == 0) {
                numValueOf = Integer.valueOf(R.drawable.upload_documents);
            } else if (iOrdinal2 == 1) {
                numValueOf = Integer.valueOf(R.drawable.documents_rejected);
            } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                if (iOrdinal2 != 4) {
                    if (iOrdinal2 != 5) {
                        uhc.a();
                        return;
                    }
                    throw new Exception("Unexpected KycStatusReminder = " + b.a);
                }
                numValueOf = null;
            }
            int i7 = ((i6 >> 3) & 112) | (i6 & 14);
            int iOrdinal3 = bVar.ordinal();
            if (iOrdinal3 == 0) {
                bVarI.N(491782451);
                strA = cb40.a(R.string.my_account__verify_your_identity, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal3 == 1) {
                bVarI.N(491786182);
                strA = cb40.a(R.string.identity_verification__identity_verification_failed, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal3 == 2) {
                bVarI.N(491790464);
                strA = cb40.a(R.string.identity_verification__documents_under_review, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal3 == 3) {
                bVarI.N(491794982);
                strA = cb40.a(R.string.identity_verification__account_pending_verification, new Object[0], bVarI);
                bVarI.X(false);
            } else {
                if (iOrdinal3 != 4) {
                    if (iOrdinal3 != 5) {
                        throw igf0.a(bVarI, 491781112, false);
                    }
                    bVarI.N(491803453);
                    bVarI.X(false);
                    throw new Exception("Unexpected KycStatusReminder = " + b.a);
                }
                bVarI.N(491799652);
                strA = cb40.a(R.string.identity_verification__id_verification_has_failed, new Object[0], bVarI);
                bVarI.X(false);
            }
            String str3 = strA;
            int iOrdinal4 = bVar.ordinal();
            if (iOrdinal4 == 0) {
                bVarI.N(2027641872);
                strA2 = cb40.a(R.string.identity_verification__upload_id_verification_documents_for_deposits, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal4 == 1) {
                bVarI.N(2027646724);
                strA2 = cb40.a(R.string.identity_verification__submitted_documents_were_rejected, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal4 == 2) {
                bVarI.N(2027651168);
                strA2 = cb40.a(R.string.identity_verification__id_documents_are_under_review, new Object[0], bVarI);
                bVarI.X(false);
            } else if (iOrdinal4 == 3) {
                bVarI.N(2027655908);
                strA2 = cb40.a(R.string.identity_verification__account_pending_verification_body, new Object[0], bVarI);
                bVarI.X(false);
            } else {
                if (iOrdinal4 != 4) {
                    if (iOrdinal4 != 5) {
                        throw igf0.a(bVarI, 2027640618, false);
                    }
                    bVarI.N(2027666710);
                    bVarI.X(false);
                    throw new Exception("Unexpected KycStatusReminder = " + b.a);
                }
                bVarI.N(2027660801);
                strA2 = cb40.a(R.string.identity_verification__sorry_we_are_unable_to_verify_your_identity_please_submit_id_documents_for_manual_verification, new Object[0], bVarI);
                bVarI.X(false);
            }
            String str4 = strA2;
            int iOrdinal5 = bVar.ordinal();
            if (iOrdinal5 != 0) {
                if (iOrdinal5 == 1) {
                    bVarI.N(1328483860);
                    strA4 = cb40.a(R.string.identity_verification__resubmit_your_documents_deposit, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal5 == 2) {
                    bVarI.N(1328488239);
                    strA4 = cb40.a(R.string.identity_verification__notify_once_we_have_result, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal5 == 3) {
                    bVarI.N(-1766395973);
                    bVarI.X(false);
                } else {
                    if (iOrdinal5 != 4) {
                        if (iOrdinal5 != 5) {
                            throw igf0.a(bVarI, 1328480382, false);
                        }
                        bVarI.N(1328496616);
                        bVarI.X(false);
                        throw new Exception("Unexpected KycStatusReminder = " + b.a);
                    }
                    bVarI.N(-1766325541);
                    bVarI.X(false);
                }
                str = strA4;
                iOrdinal = bVar.ordinal();
                if (iOrdinal != 0) {
                    bVarI.N(-657278269);
                    bVarI.X(false);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        bVarI.N(-1268124638);
                        strA3 = cb40.a(R.string.identity_verification__usually_takes_between, new Object[0], bVarI);
                        bVarI.X(false);
                    } else if (iOrdinal != 3) {
                        bVarI.N(-1268120146);
                        strA3 = cb40.a(R.string.identity_verification__account_pending_verification_note, new Object[0], bVarI);
                        bVarI.X(false);
                    } else {
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw igf0.a(bVarI, -1268129997, false);
                            }
                            bVarI.N(-1268113856);
                            bVarI.X(false);
                            throw new Exception("Unexpected KycStatusReminder = " + b.a);
                        }
                        bVarI.N(-656871549);
                        bVarI.X(false);
                    }
                    str2 = strA3;
                    aVar3 = androidx.compose.ui.d.a.b;
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a);
                    n54.a aVar6 = ht.a.m;
                    kw0.k kVar = kw0.c;
                    i78 i78VarA = g78.a(kVar, aVar6, bVarI, 0);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    androidx.compose.ui.d dVarC = c.c(bVarI, dVarB);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    yka.a.b bVar10 = yka.a.f;
                    hlh0.a(bVarI, i78VarA, bVar10);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(bVarI, ne00VarS, dVar);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        num = numValueOf;
                    } else {
                        num = numValueOf;
                        if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(bVarI, dVarC, cVar);
                        androidx.compose.ui.d dVarG = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                        i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
                        iHashCode2 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        androidx.compose.ui.d dVarC2 = c.c(bVarI, dVarG);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA2, bVar10);
                        hlh0.a(bVarI, ne00VarS2, dVar);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                        }
                        hlh0.a(bVarI, dVarC2, cVar);
                        if (num == null) {
                            bVarI.N(-102674528);
                            bVarI.X(false);
                            i2 = 3;
                            f = 24.0f;
                        } else {
                            bVarI.N(-102674527);
                            crz crzVarA = erz.a(num.intValue(), 0, bVarI);
                            f = 24.0f;
                            i2 = 3;
                            h9n.a(crzVarA, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                            Unit unit = Unit.a;
                            bVarI.X(false);
                        }
                        f2 = f;
                        lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                        lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                        bVar4 = bVarI;
                        if (parcelableArr != null) {
                            arrayList2 = new ArrayList();
                            for (Parcelable parcelable : parcelableArr) {
                                if (parcelable instanceof RejectReason) {
                                    rejectReason = (RejectReason) parcelable;
                                } else {
                                    rejectReason = null;
                                }
                                if (rejectReason != null) {
                                    arrayList2.add(rejectReason);
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            bVar4.N(-101756246);
                            z = false;
                            bVar4.X(false);
                        } else {
                            hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                            bVar4.N(-1527299814);
                            size = arrayList.size();
                            for (i3 = 0; i3 < size; i3++) {
                                bVar5 = bVar4;
                                RejectReason rejectReason2 = (RejectReason) arrayList.get(i3);
                                androidx.compose.runtime.b bVar11 = bVar5;
                                nj5.b(0, 11, 0L, null, bVar11, null, oxc.a(rejectReason2.getRequirementName(), ": ", rejectReason2.getRejectReason()));
                                bVar5 = bVar11;
                            }
                            bVar5 = bVar4;
                            z = false;
                            bVar5.X(false);
                            Unit unit2 = Unit.a;
                            bVar5.X(false);
                            bVar6 = bVar5;
                        }
                        if (str == null) {
                            bVar6.N(-101455546);
                            bVar6.X(z);
                            i4 = R.style.B1_R;
                        } else {
                            bVar6.N(-101455545);
                            androidx.compose.ui.d dVarJ = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                            long jA = c68.a(R.color.text_type1_primary, bVar6);
                            i4 = R.style.B1_R;
                            androidx.compose.runtime.b bVar12 = bVar6;
                            lkf0.d(str, dVarJ, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar12, 48, 0, 130040);
                            bVar7 = bVar12;
                            Unit unit3 = Unit.a;
                            z = false;
                            bVar7.X(false);
                        }
                        if (str2 == null) {
                            bVar6 = bVar4;
                            bVar8 = bVar7;
                            bVar6 = bVar4;
                            bVar8 = bVar6;
                            bVar8.N(-101031001);
                            bVar8.X(z);
                            bVar9 = bVar8;
                        } else {
                            bVar6 = bVar4;
                            bVar8 = bVar7;
                            bVar6 = bVar4;
                            bVar8 = bVar6;
                            bVar8.N(-101031000);
                            androidx.compose.runtime.b bVar13 = bVar8;
                            lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar13, 0, 0, 130042);
                            androidx.compose.runtime.b bVar14 = bVar13;
                            Unit unit4 = Unit.a;
                            bVar14.X(false);
                            bVar9 = bVar14;
                        }
                        a aVar7 = this;
                        bVar2 = bVar;
                        aVar7.j0(bVar2, bVar9, i7);
                        bVar9.X(true);
                        bVar9.X(true);
                        aVar2 = aVar7;
                        bVar3 = bVar9;
                    }
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar2);
                    androidx.compose.ui.d dVarG2 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                    i78 i78VarA3 = g78.a(kVar, ht.a.n, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    androidx.compose.ui.d dVarC3 = c.c(bVarI, dVarG2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA3, bVar10);
                    hlh0.a(bVarI, ne00VarS3, dVar);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar2);
                    if (num == null) {
                        bVarI.N(-102674528);
                        bVarI.X(false);
                        i2 = 3;
                        f = 24.0f;
                    } else {
                        bVarI.N(-102674527);
                        crz crzVarA2 = erz.a(num.intValue(), 0, bVarI);
                        f = 24.0f;
                        i2 = 3;
                        h9n.a(crzVarA2, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                        Unit unit5 = Unit.a;
                        bVarI.X(false);
                    }
                    f2 = f;
                    lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                    lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                    bVar4 = bVarI;
                    if (parcelableArr != null) {
                        arrayList2 = new ArrayList();
                        while (i5 < r6) {
                            if (parcelable instanceof RejectReason) {
                                rejectReason = (RejectReason) parcelable;
                            } else {
                                rejectReason = null;
                            }
                            if (rejectReason != null) {
                                arrayList2.add(rejectReason);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        bVar4.N(-101756246);
                        z = false;
                        bVar4.X(false);
                    } else {
                        hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                        bVar4.N(-1527299814);
                        size = arrayList.size();
                        while (i3 < size) {
                            bVar5 = bVar4;
                            RejectReason rejectReason3 = (RejectReason) arrayList.get(i3);
                            androidx.compose.runtime.b bVar15 = bVar5;
                            nj5.b(0, 11, 0L, null, bVar15, null, oxc.a(rejectReason3.getRequirementName(), ": ", rejectReason3.getRejectReason()));
                            bVar5 = bVar15;
                        }
                        bVar5 = bVar4;
                        z = false;
                        bVar5.X(false);
                        Unit unit6 = Unit.a;
                        bVar5.X(false);
                        bVar6 = bVar5;
                    }
                    if (str == null) {
                        bVar6.N(-101455546);
                        bVar6.X(z);
                        i4 = R.style.B1_R;
                    } else {
                        bVar6.N(-101455545);
                        androidx.compose.ui.d dVarJ2 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                        long jA2 = c68.a(R.color.text_type1_primary, bVar6);
                        i4 = R.style.B1_R;
                        androidx.compose.runtime.b bVar16 = bVar6;
                        lkf0.d(str, dVarJ2, jA2, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar16, 48, 0, 130040);
                        bVar7 = bVar16;
                        Unit unit7 = Unit.a;
                        z = false;
                        bVar7.X(false);
                    }
                    if (str2 == null) {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031001);
                        bVar8.X(z);
                        bVar9 = bVar8;
                    } else {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031000);
                        androidx.compose.runtime.b bVar17 = bVar8;
                        lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar17, 0, 0, 130042);
                        androidx.compose.runtime.b bVar18 = bVar17;
                        Unit unit8 = Unit.a;
                        bVar18.X(false);
                        bVar9 = bVar18;
                    }
                    a aVar8 = this;
                    bVar2 = bVar;
                    aVar8.j0(bVar2, bVar9, i7);
                    bVar9.X(true);
                    bVar9.X(true);
                    aVar2 = aVar8;
                    bVar3 = bVar9;
                } else {
                    bVarI.N(-657218749);
                    bVarI.X(false);
                }
                str2 = null;
                aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a);
                n54.a aVar9 = ht.a.m;
                kw0.k kVar2 = kw0.c;
                i78 i78VarA4 = g78.a(kVar2, aVar9, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC4 = c.c(bVarI, dVarB2);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar19 = yka.a.f;
                hlh0.a(bVarI, i78VarA4, bVar19);
                yka.a.d dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS4, dVar2);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    num = numValueOf;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar3 = yka.a.d;
                    hlh0.a(bVarI, dVarC4, cVar3);
                    androidx.compose.ui.d dVarG3 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                    i78 i78VarA5 = g78.a(kVar2, ht.a.n, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS5 = bVarI.S();
                    androidx.compose.ui.d dVarC5 = c.c(bVarI, dVarG3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA5, bVar19);
                    hlh0.a(bVarI, ne00VarS5, dVar2);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC5, cVar3);
                    if (num == null) {
                        bVarI.N(-102674528);
                        bVarI.X(false);
                        i2 = 3;
                        f = 24.0f;
                    } else {
                        bVarI.N(-102674527);
                        crz crzVarA3 = erz.a(num.intValue(), 0, bVarI);
                        f = 24.0f;
                        i2 = 3;
                        h9n.a(crzVarA3, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                        Unit unit9 = Unit.a;
                        bVarI.X(false);
                    }
                    f2 = f;
                    lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                    lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                    bVar4 = bVarI;
                    if (parcelableArr != null) {
                        arrayList2 = new ArrayList();
                        while (i5 < r6) {
                            if (parcelable instanceof RejectReason) {
                                rejectReason = (RejectReason) parcelable;
                            } else {
                                rejectReason = null;
                            }
                            if (rejectReason != null) {
                                arrayList2.add(rejectReason);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        bVar4.N(-101756246);
                        z = false;
                        bVar4.X(false);
                    } else {
                        hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                        bVar4.N(-1527299814);
                        size = arrayList.size();
                        while (i3 < size) {
                            bVar5 = bVar4;
                            RejectReason rejectReason4 = (RejectReason) arrayList.get(i3);
                            androidx.compose.runtime.b bVar110 = bVar5;
                            nj5.b(0, 11, 0L, null, bVar110, null, oxc.a(rejectReason4.getRequirementName(), ": ", rejectReason4.getRejectReason()));
                            bVar5 = bVar110;
                        }
                        bVar5 = bVar4;
                        z = false;
                        bVar5.X(false);
                        Unit unit10 = Unit.a;
                        bVar5.X(false);
                        bVar6 = bVar5;
                    }
                    if (str == null) {
                        bVar6.N(-101455546);
                        bVar6.X(z);
                        i4 = R.style.B1_R;
                    } else {
                        bVar6.N(-101455545);
                        androidx.compose.ui.d dVarJ3 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                        long jA3 = c68.a(R.color.text_type1_primary, bVar6);
                        i4 = R.style.B1_R;
                        androidx.compose.runtime.b bVar111 = bVar6;
                        lkf0.d(str, dVarJ3, jA3, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar111, 48, 0, 130040);
                        bVar7 = bVar111;
                        Unit unit11 = Unit.a;
                        z = false;
                        bVar7.X(false);
                    }
                    if (str2 == null) {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031001);
                        bVar8.X(z);
                        bVar9 = bVar8;
                    } else {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031000);
                        androidx.compose.runtime.b bVar112 = bVar8;
                        lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar112, 0, 0, 130042);
                        androidx.compose.runtime.b bVar113 = bVar112;
                        Unit unit12 = Unit.a;
                        bVar113.X(false);
                        bVar9 = bVar113;
                    }
                    a aVar10 = this;
                    bVar2 = bVar;
                    aVar10.j0(bVar2, bVar9, i7);
                    bVar9.X(true);
                    bVar9.X(true);
                    aVar2 = aVar10;
                    bVar3 = bVar9;
                } else {
                    num = numValueOf;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(bVarI, dVarC4, cVar4);
                androidx.compose.ui.d dVarG4 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                i78 i78VarA6 = g78.a(kVar2, ht.a.n, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS6 = bVarI.S();
                androidx.compose.ui.d dVarC6 = c.c(bVarI, dVarG4);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA6, bVar19);
                hlh0.a(bVarI, ne00VarS6, dVar2);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar4);
                if (num == null) {
                    bVarI.N(-102674528);
                    bVarI.X(false);
                    i2 = 3;
                    f = 24.0f;
                } else {
                    bVarI.N(-102674527);
                    crz crzVarA4 = erz.a(num.intValue(), 0, bVarI);
                    f = 24.0f;
                    i2 = 3;
                    h9n.a(crzVarA4, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                    Unit unit13 = Unit.a;
                    bVarI.X(false);
                }
                f2 = f;
                lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                bVar4 = bVarI;
                if (parcelableArr != null) {
                    arrayList2 = new ArrayList();
                    while (i5 < r6) {
                        if (parcelable instanceof RejectReason) {
                            rejectReason = (RejectReason) parcelable;
                        } else {
                            rejectReason = null;
                        }
                        if (rejectReason != null) {
                            arrayList2.add(rejectReason);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    bVar4.N(-101756246);
                    z = false;
                    bVar4.X(false);
                } else {
                    hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                    bVar4.N(-1527299814);
                    size = arrayList.size();
                    while (i3 < size) {
                        bVar5 = bVar4;
                        RejectReason rejectReason5 = (RejectReason) arrayList.get(i3);
                        androidx.compose.runtime.b bVar114 = bVar5;
                        nj5.b(0, 11, 0L, null, bVar114, null, oxc.a(rejectReason5.getRequirementName(), ": ", rejectReason5.getRejectReason()));
                        bVar5 = bVar114;
                    }
                    bVar5 = bVar4;
                    z = false;
                    bVar5.X(false);
                    Unit unit14 = Unit.a;
                    bVar5.X(false);
                    bVar6 = bVar5;
                }
                if (str == null) {
                    bVar6.N(-101455546);
                    bVar6.X(z);
                    i4 = R.style.B1_R;
                } else {
                    bVar6.N(-101455545);
                    androidx.compose.ui.d dVarJ4 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                    long jA4 = c68.a(R.color.text_type1_primary, bVar6);
                    i4 = R.style.B1_R;
                    androidx.compose.runtime.b bVar115 = bVar6;
                    lkf0.d(str, dVarJ4, jA4, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar115, 48, 0, 130040);
                    bVar7 = bVar115;
                    Unit unit15 = Unit.a;
                    z = false;
                    bVar7.X(false);
                }
                if (str2 == null) {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031001);
                    bVar8.X(z);
                    bVar9 = bVar8;
                } else {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031000);
                    androidx.compose.runtime.b bVar116 = bVar8;
                    lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar116, 0, 0, 130042);
                    androidx.compose.runtime.b bVar117 = bVar116;
                    Unit unit16 = Unit.a;
                    bVar117.X(false);
                    bVar9 = bVar117;
                }
                a aVar11 = this;
                bVar2 = bVar;
                aVar11.j0(bVar2, bVar9, i7);
                bVar9.X(true);
                bVar9.X(true);
                aVar2 = aVar11;
                bVar3 = bVar9;
            } else {
                bVarI.N(-1766735237);
                bVarI.X(false);
            }
            str = null;
            iOrdinal = bVar.ordinal();
            if (iOrdinal != 0) {
                bVarI.N(-657278269);
                bVarI.X(false);
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    bVarI.N(-1268124638);
                    strA3 = cb40.a(R.string.identity_verification__usually_takes_between, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal != 3) {
                    bVarI.N(-1268120146);
                    strA3 = cb40.a(R.string.identity_verification__account_pending_verification_note, new Object[0], bVarI);
                    bVarI.X(false);
                } else {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            throw igf0.a(bVarI, -1268129997, false);
                        }
                        bVarI.N(-1268113856);
                        bVarI.X(false);
                        throw new Exception("Unexpected KycStatusReminder = " + b.a);
                    }
                    bVarI.N(-656871549);
                    bVarI.X(false);
                }
                str2 = strA3;
                aVar3 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarB3 = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a);
                n54.a aVar12 = ht.a.m;
                kw0.k kVar3 = kw0.c;
                i78 i78VarA7 = g78.a(kVar3, aVar12, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                androidx.compose.ui.d dVarC7 = c.c(bVarI, dVarB3);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar118 = yka.a.f;
                hlh0.a(bVarI, i78VarA7, bVar118);
                yka.a.d dVar3 = yka.a.e;
                hlh0.a(bVarI, ne00VarS7, dVar3);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    num = numValueOf;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar5 = yka.a.d;
                    hlh0.a(bVarI, dVarC7, cVar5);
                    androidx.compose.ui.d dVarG5 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                    i78 i78VarA8 = g78.a(kVar3, ht.a.n, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS8 = bVarI.S();
                    androidx.compose.ui.d dVarC8 = c.c(bVarI, dVarG5);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA8, bVar118);
                    hlh0.a(bVarI, ne00VarS8, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC8, cVar5);
                    if (num == null) {
                        bVarI.N(-102674528);
                        bVarI.X(false);
                        i2 = 3;
                        f = 24.0f;
                    } else {
                        bVarI.N(-102674527);
                        crz crzVarA5 = erz.a(num.intValue(), 0, bVarI);
                        f = 24.0f;
                        i2 = 3;
                        h9n.a(crzVarA5, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                        Unit unit17 = Unit.a;
                        bVarI.X(false);
                    }
                    f2 = f;
                    lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                    lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                    bVar4 = bVarI;
                    if (parcelableArr != null) {
                        arrayList2 = new ArrayList();
                        while (i5 < r6) {
                            if (parcelable instanceof RejectReason) {
                                rejectReason = (RejectReason) parcelable;
                            } else {
                                rejectReason = null;
                            }
                            if (rejectReason != null) {
                                arrayList2.add(rejectReason);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        bVar4.N(-101756246);
                        z = false;
                        bVar4.X(false);
                    } else {
                        hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                        bVar4.N(-1527299814);
                        size = arrayList.size();
                        while (i3 < size) {
                            bVar5 = bVar4;
                            RejectReason rejectReason6 = (RejectReason) arrayList.get(i3);
                            androidx.compose.runtime.b bVar119 = bVar5;
                            nj5.b(0, 11, 0L, null, bVar119, null, oxc.a(rejectReason6.getRequirementName(), ": ", rejectReason6.getRejectReason()));
                            bVar5 = bVar119;
                        }
                        bVar5 = bVar4;
                        z = false;
                        bVar5.X(false);
                        Unit unit18 = Unit.a;
                        bVar5.X(false);
                        bVar6 = bVar5;
                    }
                    if (str == null) {
                        bVar6.N(-101455546);
                        bVar6.X(z);
                        i4 = R.style.B1_R;
                    } else {
                        bVar6.N(-101455545);
                        androidx.compose.ui.d dVarJ5 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                        long jA5 = c68.a(R.color.text_type1_primary, bVar6);
                        i4 = R.style.B1_R;
                        androidx.compose.runtime.b bVar1110 = bVar6;
                        lkf0.d(str, dVarJ5, jA5, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar1110, 48, 0, 130040);
                        bVar7 = bVar1110;
                        Unit unit19 = Unit.a;
                        z = false;
                        bVar7.X(false);
                    }
                    if (str2 == null) {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031001);
                        bVar8.X(z);
                        bVar9 = bVar8;
                    } else {
                        bVar6 = bVar4;
                        bVar8 = bVar7;
                        bVar6 = bVar4;
                        bVar8 = bVar6;
                        bVar8.N(-101031000);
                        androidx.compose.runtime.b bVar1111 = bVar8;
                        lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar1111, 0, 0, 130042);
                        androidx.compose.runtime.b bVar1112 = bVar1111;
                        Unit unit110 = Unit.a;
                        bVar1112.X(false);
                        bVar9 = bVar1112;
                    }
                    a aVar13 = this;
                    bVar2 = bVar;
                    aVar13.j0(bVar2, bVar9, i7);
                    bVar9.X(true);
                    bVar9.X(true);
                    aVar2 = aVar13;
                    bVar3 = bVar9;
                } else {
                    num = numValueOf;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar6 = yka.a.d;
                hlh0.a(bVarI, dVarC7, cVar6);
                androidx.compose.ui.d dVarG6 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                i78 i78VarA9 = g78.a(kVar3, ht.a.n, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS9 = bVarI.S();
                androidx.compose.ui.d dVarC9 = c.c(bVarI, dVarG6);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA9, bVar118);
                hlh0.a(bVarI, ne00VarS9, dVar3);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC9, cVar6);
                if (num == null) {
                    bVarI.N(-102674528);
                    bVarI.X(false);
                    i2 = 3;
                    f = 24.0f;
                } else {
                    bVarI.N(-102674527);
                    crz crzVarA6 = erz.a(num.intValue(), 0, bVarI);
                    f = 24.0f;
                    i2 = 3;
                    h9n.a(crzVarA6, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                    Unit unit111 = Unit.a;
                    bVarI.X(false);
                }
                f2 = f;
                lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                bVar4 = bVarI;
                if (parcelableArr != null) {
                    arrayList2 = new ArrayList();
                    while (i5 < r6) {
                        if (parcelable instanceof RejectReason) {
                            rejectReason = (RejectReason) parcelable;
                        } else {
                            rejectReason = null;
                        }
                        if (rejectReason != null) {
                            arrayList2.add(rejectReason);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    bVar4.N(-101756246);
                    z = false;
                    bVar4.X(false);
                } else {
                    hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                    bVar4.N(-1527299814);
                    size = arrayList.size();
                    while (i3 < size) {
                        bVar5 = bVar4;
                        RejectReason rejectReason7 = (RejectReason) arrayList.get(i3);
                        androidx.compose.runtime.b bVar1113 = bVar5;
                        nj5.b(0, 11, 0L, null, bVar1113, null, oxc.a(rejectReason7.getRequirementName(), ": ", rejectReason7.getRejectReason()));
                        bVar5 = bVar1113;
                    }
                    bVar5 = bVar4;
                    z = false;
                    bVar5.X(false);
                    Unit unit112 = Unit.a;
                    bVar5.X(false);
                    bVar6 = bVar5;
                }
                if (str == null) {
                    bVar6.N(-101455546);
                    bVar6.X(z);
                    i4 = R.style.B1_R;
                } else {
                    bVar6.N(-101455545);
                    androidx.compose.ui.d dVarJ6 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                    long jA6 = c68.a(R.color.text_type1_primary, bVar6);
                    i4 = R.style.B1_R;
                    androidx.compose.runtime.b bVar1114 = bVar6;
                    lkf0.d(str, dVarJ6, jA6, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar1114, 48, 0, 130040);
                    bVar7 = bVar1114;
                    Unit unit113 = Unit.a;
                    z = false;
                    bVar7.X(false);
                }
                if (str2 == null) {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031001);
                    bVar8.X(z);
                    bVar9 = bVar8;
                } else {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031000);
                    androidx.compose.runtime.b bVar1115 = bVar8;
                    lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar1115, 0, 0, 130042);
                    androidx.compose.runtime.b bVar1116 = bVar1115;
                    Unit unit114 = Unit.a;
                    bVar1116.X(false);
                    bVar9 = bVar1116;
                }
                a aVar14 = this;
                bVar2 = bVar;
                aVar14.j0(bVar2, bVar9, i7);
                bVar9.X(true);
                bVar9.X(true);
                aVar2 = aVar14;
                bVar3 = bVar9;
            } else {
                bVarI.N(-657218749);
                bVarI.X(false);
            }
            str2 = null;
            aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB4 = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.background_type1_secondary, bVarI), zk40.a);
            n54.a aVar15 = ht.a.m;
            kw0.k kVar4 = kw0.c;
            i78 i78VarA10 = g78.a(kVar4, aVar15, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS10 = bVarI.S();
            androidx.compose.ui.d dVarC10 = c.c(bVarI, dVarB4);
            yka.k.getClass();
            aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar1117 = yka.a.f;
            hlh0.a(bVarI, i78VarA10, bVar1117);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS10, dVar4);
            c1350a = yka.a.g;
            if (bVarI.S) {
                num = numValueOf;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar7 = yka.a.d;
                hlh0.a(bVarI, dVarC10, cVar7);
                androidx.compose.ui.d dVarG7 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
                i78 i78VarA11 = g78.a(kVar4, ht.a.n, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS11 = bVarI.S();
                androidx.compose.ui.d dVarC11 = c.c(bVarI, dVarG7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA11, bVar1117);
                hlh0.a(bVarI, ne00VarS11, dVar4);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC11, cVar7);
                if (num == null) {
                    bVarI.N(-102674528);
                    bVarI.X(false);
                    i2 = 3;
                    f = 24.0f;
                } else {
                    bVarI.N(-102674527);
                    crz crzVarA7 = erz.a(num.intValue(), 0, bVarI);
                    f = 24.0f;
                    i2 = 3;
                    h9n.a(crzVarA7, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                    Unit unit115 = Unit.a;
                    bVarI.X(false);
                }
                f2 = f;
                lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
                lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
                bVar4 = bVarI;
                if (parcelableArr != null) {
                    arrayList2 = new ArrayList();
                    while (i5 < r6) {
                        if (parcelable instanceof RejectReason) {
                            rejectReason = (RejectReason) parcelable;
                        } else {
                            rejectReason = null;
                        }
                        if (rejectReason != null) {
                            arrayList2.add(rejectReason);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    bVar4.N(-101756246);
                    z = false;
                    bVar4.X(false);
                } else {
                    hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                    bVar4.N(-1527299814);
                    size = arrayList.size();
                    while (i3 < size) {
                        bVar5 = bVar4;
                        RejectReason rejectReason8 = (RejectReason) arrayList.get(i3);
                        androidx.compose.runtime.b bVar1118 = bVar5;
                        nj5.b(0, 11, 0L, null, bVar1118, null, oxc.a(rejectReason8.getRequirementName(), ": ", rejectReason8.getRejectReason()));
                        bVar5 = bVar1118;
                    }
                    bVar5 = bVar4;
                    z = false;
                    bVar5.X(false);
                    Unit unit116 = Unit.a;
                    bVar5.X(false);
                    bVar6 = bVar5;
                }
                if (str == null) {
                    bVar6.N(-101455546);
                    bVar6.X(z);
                    i4 = R.style.B1_R;
                } else {
                    bVar6.N(-101455545);
                    androidx.compose.ui.d dVarJ7 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                    long jA7 = c68.a(R.color.text_type1_primary, bVar6);
                    i4 = R.style.B1_R;
                    androidx.compose.runtime.b bVar1119 = bVar6;
                    lkf0.d(str, dVarJ7, jA7, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar1119, 48, 0, 130040);
                    bVar7 = bVar1119;
                    Unit unit117 = Unit.a;
                    z = false;
                    bVar7.X(false);
                }
                if (str2 == null) {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031001);
                    bVar8.X(z);
                    bVar9 = bVar8;
                } else {
                    bVar6 = bVar4;
                    bVar8 = bVar7;
                    bVar6 = bVar4;
                    bVar8 = bVar6;
                    bVar8.N(-101031000);
                    androidx.compose.runtime.b bVar11110 = bVar8;
                    lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar11110, 0, 0, 130042);
                    androidx.compose.runtime.b bVar11111 = bVar11110;
                    Unit unit118 = Unit.a;
                    bVar11111.X(false);
                    bVar9 = bVar11111;
                }
                a aVar16 = this;
                bVar2 = bVar;
                aVar16.j0(bVar2, bVar9, i7);
                bVar9.X(true);
                bVar9.X(true);
                aVar2 = aVar16;
                bVar3 = bVar9;
            } else {
                num = numValueOf;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar8 = yka.a.d;
            hlh0.a(bVarI, dVarC10, cVar8);
            androidx.compose.ui.d dVarG8 = h.g(j.g(aVar3, 1.0f), 16.0f, 24.0f);
            i78 i78VarA12 = g78.a(kVar4, ht.a.n, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS12 = bVarI.S();
            androidx.compose.ui.d dVarC12 = c.c(bVarI, dVarG8);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA12, bVar1117);
            hlh0.a(bVarI, ne00VarS12, dVar4);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC12, cVar8);
            if (num == null) {
                bVarI.N(-102674528);
                bVarI.X(false);
                i2 = 3;
                f = 24.0f;
            } else {
                bVarI.N(-102674527);
                crz crzVarA8 = erz.a(num.intValue(), 0, bVarI);
                f = 24.0f;
                i2 = 3;
                h9n.a(crzVarA8, null, null, null, null, 0.0f, null, bVarI, 48, 124);
                Unit unit119 = Unit.a;
                bVarI.X(false);
            }
            f2 = f;
            lkf0.d(str3, h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 48, 0, 130040);
            lkf0.d(str4, h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(i2), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 130040);
            bVar4 = bVarI;
            if (parcelableArr != null) {
                arrayList2 = new ArrayList();
                while (i5 < r6) {
                    if (parcelable instanceof RejectReason) {
                        rejectReason = (RejectReason) parcelable;
                    } else {
                        rejectReason = null;
                    }
                    if (rejectReason != null) {
                        arrayList2.add(rejectReason);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                bVar4.N(-101756246);
                z = false;
                bVar4.X(false);
            } else {
                hnw.a(bVar4, -101756245, aVar3, f2, bVar4);
                bVar4.N(-1527299814);
                size = arrayList.size();
                while (i3 < size) {
                    bVar5 = bVar4;
                    RejectReason rejectReason9 = (RejectReason) arrayList.get(i3);
                    androidx.compose.runtime.b bVar11112 = bVar5;
                    nj5.b(0, 11, 0L, null, bVar11112, null, oxc.a(rejectReason9.getRequirementName(), ": ", rejectReason9.getRejectReason()));
                    bVar5 = bVar11112;
                }
                bVar5 = bVar4;
                z = false;
                bVar5.X(false);
                Unit unit1110 = Unit.a;
                bVar5.X(false);
                bVar6 = bVar5;
            }
            if (str == null) {
                bVar6.N(-101455546);
                bVar6.X(z);
                i4 = R.style.B1_R;
            } else {
                bVar6.N(-101455545);
                androidx.compose.ui.d dVarJ8 = h.j(aVar3, 0.0f, f2, 0.0f, 0.0f, 13);
                long jA8 = c68.a(R.color.text_type1_primary, bVar6);
                i4 = R.style.B1_R;
                androidx.compose.runtime.b bVar11113 = bVar6;
                lkf0.d(str, dVarJ8, jA8, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar6), bVar11113, 48, 0, 130040);
                bVar7 = bVar11113;
                Unit unit1111 = Unit.a;
                z = false;
                bVar7.X(false);
            }
            if (str2 == null) {
                bVar6 = bVar4;
                bVar8 = bVar7;
                bVar6 = bVar4;
                bVar8 = bVar6;
                bVar8.N(-101031001);
                bVar8.X(z);
                bVar9 = bVar8;
            } else {
                bVar6 = bVar4;
                bVar8 = bVar7;
                bVar6 = bVar4;
                bVar8 = bVar6;
                bVar8.N(-101031000);
                androidx.compose.runtime.b bVar11114 = bVar8;
                lkf0.d(str2, null, c68.a(R.color.text_type1_secondary, bVar8), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(i4, bVar8), bVar11114, 0, 0, 130042);
                androidx.compose.runtime.b bVar11115 = bVar11114;
                Unit unit1112 = Unit.a;
                bVar11115.X(false);
                bVar9 = bVar11115;
            }
            a aVar17 = this;
            bVar2 = bVar;
            aVar17.j0(bVar2, bVar9, i7);
            bVar9.X(true);
            bVar9.X(true);
            aVar2 = aVar17;
            bVar3 = bVar9;
        } else {
            bVar2 = bVar;
            bVarI.G();
            aVar2 = aVar5;
            bVar3 = bVarI;
        }
        e eVarZ = bVar3.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar2, parcelableArr, i) { // from class: r9k0
                public final /* synthetic */ b b;
                public final /* synthetic */ Parcelable[] c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Exception {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.m0(this.b, this.c, (androidx.compose.runtime.a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        setCancelable(false);
        b.a aVar = b.a;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KYC_STATUS") : null;
        aVar.getClass();
        final b bVarA = b.a.a(string);
        Bundle arguments2 = getArguments();
        final Parcelable[] parcelableArray = arguments2 != null ? arguments2.getParcelableArray("REJECT_REASONS") : null;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1752527297, new Function2() { // from class: q9k0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws Exception {
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.a.m0(bVarA, parcelableArray, aVar2, 0);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
