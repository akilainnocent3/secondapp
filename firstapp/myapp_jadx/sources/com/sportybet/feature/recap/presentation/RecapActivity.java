package com.sportybet.feature.recap.presentation;

import android.content.Intent;
import android.os.Bundle;
import defpackage.arr;
import defpackage.azm;
import defpackage.cyb;
import defpackage.g1i;
import defpackage.g1m;
import defpackage.jq40;
import defpackage.k00;
import defpackage.kf40;
import defpackage.mgb0;
import defpackage.nc40;
import defpackage.op8;
import defpackage.phx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qs3;
import defpackage.r8i0;
import defpackage.rc40;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sf40;
import defpackage.v8i0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/recap/presentation/RecapActivity;", "Lpy1;", "<init>", "()V", "Lpf40;", "uiState", "recap"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RecapActivity extends g1m {
    public static final /* synthetic */ int f = 0;
    public final q8i0 b = new q8i0(jq40.a(sf40.class), new d(), new c(), new e());
    public azm c;
    public mgb0 d;
    public phx e;

    public static final /* synthetic */ class a extends saj implements Function1<nc40, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(nc40 nc40Var) {
            nc40 nc40Var2 = nc40Var;
            nc40Var2.getClass();
            ((sf40) this.receiver).x1(nc40Var2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<nc40, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(nc40 nc40Var) {
            nc40 nc40Var2 = nc40Var;
            nc40Var2.getClass();
            ((sf40) this.receiver).x1(nc40Var2);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return RecapActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return RecapActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return RecapActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        String stringExtra;
        super.onCreate(bundle);
        q8i0 q8i0Var = this.b;
        String str = null;
        g1i g1iVar = new g1i(((sf40) q8i0Var.getValue()).w, new rc40(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        zn8.a(this, new op8(-2107196134, new qs3(this), true));
        Intent intent2 = getIntent();
        if ((intent2 != null ? intent2.getStringExtra("purpose") : null) == null) {
            intent = getIntent();
            if (intent != null) {
                stringExtra = intent.getStringExtra("recap_destination");
            } else {
                stringExtra = null;
            }
            if (Intrinsics.g(stringExtra, "RECAP")) {
                str = "notification_center";
            }
        } else {
            Intent intent3 = getIntent();
            if ((intent3 != null ? intent3.getStringExtra("purposeId") : null) != null) {
                str = "push_notification";
            } else {
                intent = getIntent();
                if (intent != null) {
                    stringExtra = intent.getStringExtra("recap_destination");
                } else {
                    stringExtra = null;
                }
                if (Intrinsics.g(stringExtra, "RECAP")) {
                    str = "notification_center";
                }
            }
        }
        if (str != null) {
            ((sf40) q8i0Var.getValue()).x1(new nc40.f(new kf40.c(str), kotlin.collections.b.k(k00.d, k00.c)));
        }
    }
}
