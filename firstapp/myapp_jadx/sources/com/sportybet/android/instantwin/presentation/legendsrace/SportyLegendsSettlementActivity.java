package com.sportybet.android.instantwin.presentation.legendsrace;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.instantwin.presentation.legendsrace.SportyLegendsSettlementActivity;
import com.sportybet.android.instantwin.presentation.legendsrace.c;
import defpackage.aqe0;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.fkc0;
import defpackage.gkc0;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.n0f;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.w9c0;
import defpackage.y3m;
import defpackage.zn8;
import defpackage.zpe0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/legendsrace/SportyLegendsSettlementActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyLegendsSettlementActivity extends y3m implements rlf, bb40 {
    public static final /* synthetic */ int f = 0;
    public final q8i0 b = new q8i0(jq40.a(com.sportybet.android.instantwin.presentation.legendsrace.c.class), new b(), new a(), new c());
    public w9c0 c;
    public jlo d;
    public n0f e;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyLegendsSettlementActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyLegendsSettlementActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyLegendsSettlementActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n0f n0fVar = this.e;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.c();
        zpe0 zpe0Var = zpe0.a;
        elf.a(this, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        zn8.a(this, new op8(-92447244, new Function2() { // from class: ckc0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = SportyLegendsSettlementActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final SportyLegendsSettlementActivity sportyLegendsSettlementActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1731173733, new Function2() { // from class: dkc0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = SportyLegendsSettlementActivity.f;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final SportyLegendsSettlementActivity sportyLegendsSettlementActivity2 = sportyLegendsSettlementActivity;
                                mlo.a(0, 0, pp8.b(1264564101, new Function2() { // from class: ekc0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        int i3 = SportyLegendsSettlementActivity.f;
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            nlc0.a(null, (c) sportyLegendsSettlementActivity2.b.getValue(), aVar3, 64);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 384);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        getOnBackPressedDispatcher().a(this, new fkc0(true));
        ku90<com.sportybet.android.instantwin.presentation.legendsrace.b> ku90Var = ((com.sportybet.android.instantwin.presentation.legendsrace.c) this.b.getValue()).v;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new gkc0(this, ku90Var, null, this), 3);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        n0f n0fVar = this.e;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.d();
        super.onDestroy();
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        n0f n0fVar = this.e;
        if (n0fVar == null) {
            Intrinsics.n("doubleOrNothingAudioPlayer");
            throw null;
        }
        n0fVar.e();
        super.onStop();
    }
}
