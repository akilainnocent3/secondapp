package com.sportybet.feature.gift.gift.presentation;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.gift.presentation.GiftActivity;
import com.sportybet.feature.gift.gift.presentation.k;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bum;
import defpackage.cyb;
import defpackage.e1i;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.hik;
import defpackage.iik;
import defpackage.jik;
import defpackage.jq40;
import defpackage.jrl;
import defpackage.k9j;
import defpackage.kik;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.pu0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.saj;
import defpackage.uvk;
import defpackage.uzh;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/gift/gift/presentation/GiftActivity;", "Lpy1;", "Lbb40;", "Lvym;", "Lk9j;", "Lrlf;", "<init>", "()V", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class GiftActivity extends jrl implements bb40, vym, k9j, rlf {
    public static final /* synthetic */ int e = 0;
    public final q8i0 b = new q8i0(jq40.a(k.class), new c(), new b(), new d());
    public azm c;
    public bum d;

    public static final /* synthetic */ class a extends saj implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            GiftActivity giftActivity = (GiftActivity) this.receiver;
            int i = GiftActivity.e;
            giftActivity.getClass();
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(giftActivity);
            AlertController.b bVar = aVar.a;
            bVar.f = str2;
            bVar.k = false;
            aVar.setPositiveButton(R.string.common_functions__ok, new hik()).f();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GiftActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GiftActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GiftActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        if (getAccountHelper().getAccount() == null) {
            finish();
            return;
        }
        Intent intent = getIntent();
        uvk uvkVar = Intrinsics.g(intent != null ? intent.getStringExtra("tab") : null, "usedExpired") ? uvk.b : uvk.a;
        q8i0 q8i0Var = this.b;
        ((k) q8i0Var.getValue()).y1(new com.sportybet.feature.gift.gift.presentation.b.k(uvkVar));
        k kVar = (k) q8i0Var.getValue();
        kzh.d(kVar.b.h(pu0.c.a), o8i0.d(kVar));
        ku90<e> ku90Var = ((k) q8i0Var.getValue()).G;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new iik(this, ku90Var, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new jik(this, uzh.b(new kik(e1i.b(((k) q8i0Var.getValue()).H))), null, this), 3);
        zn8.a(this, new op8(803075713, new Function2() { // from class: fik
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = GiftActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final GiftActivity giftActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(1518931632, new Function2() { // from class: gik
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = GiftActivity.e;
                            int i3 = 1;
                            int i4 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                GiftActivity giftActivity2 = giftActivity;
                                k kVar2 = (k) giftActivity2.b.getValue();
                                boolean zA = aVar2.A(giftActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new dab(giftActivity2, i3);
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(giftActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new t62(giftActivity2, i4);
                                    aVar2.r(objY2);
                                }
                                Function1 function1 = (Function1) objY2;
                                boolean zA3 = aVar2.A(giftActivity2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    GiftActivity.a aVar3 = new GiftActivity.a(1, giftActivity2, GiftActivity.class, "showAlertDialog", "showAlertDialog(Ljava/lang/String;)V", 0);
                                    aVar2.r(aVar3);
                                    objY3 = aVar3;
                                }
                                vpk.a(kVar2, function0, function1, (Function1) ((chp) objY3), null, aVar2, 8);
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
