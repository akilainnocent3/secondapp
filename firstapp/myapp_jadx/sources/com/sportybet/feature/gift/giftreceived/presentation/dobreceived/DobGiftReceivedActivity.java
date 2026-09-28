package com.sportybet.feature.gift.giftreceived.presentation.dobreceived;

import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedActivity;
import com.sportybet.feature.gift.giftreceived.presentation.dobreceived.b;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bum;
import defpackage.cve;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.eql;
import defpackage.jq40;
import defpackage.jve;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/presentation/dobreceived/DobGiftReceivedActivity;", "Lpy1;", "Lbb40;", "Lrlf;", "<init>", "()V", "Live;", "state", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DobGiftReceivedActivity extends eql implements bb40, rlf {
    public static final /* synthetic */ int e = 0;
    public final q8i0 b = new q8i0(jq40.a(jve.class), new b(), new a(), new c());
    public azm c;
    public bum d;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return DobGiftReceivedActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return DobGiftReceivedActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return DobGiftReceivedActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R.anim.slide_out_bottom, R.anim.fade_out);
        } else {
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.fade_out);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(2462562, new Function2() { // from class: yue
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = DobGiftReceivedActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final DobGiftReceivedActivity dobGiftReceivedActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(-562691887, new Function2() { // from class: zue
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = DobGiftReceivedActivity.e;
                            int i3 = 1;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final DobGiftReceivedActivity dobGiftReceivedActivity2 = dobGiftReceivedActivity;
                                ytw ytwVarC = wyh.c(((jve) dobGiftReceivedActivity2.b.getValue()).i, aVar2, 0, 7);
                                String str = ((ive) ytwVarC.getValue()).b;
                                String str2 = ((ive) ytwVarC.getValue()).c;
                                String str3 = ((ive) ytwVarC.getValue()).a;
                                boolean zA = aVar2.A(dobGiftReceivedActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: ave
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = DobGiftReceivedActivity.e;
                                            DobGiftReceivedActivity dobGiftReceivedActivity3 = dobGiftReceivedActivity2;
                                            azm azmVar = dobGiftReceivedActivity3.c;
                                            if (azmVar == null) {
                                                Intrinsics.n("generalRouter");
                                                throw null;
                                            }
                                            azmVar.d(wae.ME_GIFTS);
                                            dobGiftReceivedActivity3.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(dobGiftReceivedActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: bve
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = DobGiftReceivedActivity.e;
                                            jve jveVar = (jve) dobGiftReceivedActivity2.b.getValue();
                                            ej5.c(o8i0.d(jveVar), null, null, new b(jveVar, ApplicableCategoryIds.a(((ive) jveVar.f.getValue()).d), null), 3);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(dobGiftReceivedActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new kha(dobGiftReceivedActivity2, i3);
                                    aVar2.r(objY3);
                                }
                                hve.b(str, str2, str3, function0, function1, (Function0) objY3, aVar2, 0);
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
        t340 t340Var = ((jve) this.b.getValue()).w;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new cve(this, t340Var, null, this), 3);
    }
}
