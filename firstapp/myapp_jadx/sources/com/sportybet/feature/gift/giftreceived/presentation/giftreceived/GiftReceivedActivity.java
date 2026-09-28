package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.GiftReceivedActivity;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.e;
import com.sportybet.feature.gift.giftreceived.presentation.giftreceived.i;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bum;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.lqk;
import defpackage.nrl;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/presentation/giftreceived/GiftReceivedActivity;", "Lpy1;", "Lbb40;", "Lrlf;", "<init>", "()V", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GiftReceivedActivity extends nrl implements bb40, rlf {
    public static final /* synthetic */ int e = 0;
    public final q8i0 b = new q8i0(jq40.a(i.class), new b(), new a(), new c());
    public azm c;
    public bum d;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GiftReceivedActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GiftReceivedActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GiftReceivedActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final i A1() {
        return (i) this.b.getValue();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-1691474583, new Function2() { // from class: jqk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = GiftReceivedActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final GiftReceivedActivity giftReceivedActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(-331559270, new Function2() { // from class: kqk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = GiftReceivedActivity.e;
                            int i3 = 1;
                            int i4 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                GiftReceivedActivity giftReceivedActivity2 = giftReceivedActivity;
                                i iVarA1 = giftReceivedActivity2.A1();
                                boolean zA = aVar2.A(giftReceivedActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new eeb(giftReceivedActivity2, i3);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(giftReceivedActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new ne2(giftReceivedActivity2, i4);
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(giftReceivedActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    objY3 = new feb(giftReceivedActivity2, i3);
                                    aVar2.r(objY3);
                                }
                                Function0 function2 = (Function0) objY3;
                                boolean zA4 = aVar2.A(giftReceivedActivity2);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    objY4 = new geb(giftReceivedActivity2, i3);
                                    aVar2.r(objY4);
                                }
                                Function0 function3 = (Function0) objY4;
                                boolean zA5 = aVar2.A(giftReceivedActivity2);
                                Object objY5 = aVar2.y();
                                if (zA5 || objY5 == c0042a) {
                                    objY5 = new heb(giftReceivedActivity2, i3);
                                    aVar2.r(objY5);
                                }
                                e.e(iVarA1, function0, function1, function2, function3, (Function0) objY5, aVar2, 8);
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
        ku90<f> ku90Var = A1().f;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new lqk(this, ku90Var, null, this), 3);
    }

    public final azm z1() {
        azm azmVar = this.c;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }
}
