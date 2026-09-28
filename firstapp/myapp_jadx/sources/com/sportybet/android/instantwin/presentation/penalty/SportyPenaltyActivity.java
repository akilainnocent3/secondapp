package com.sportybet.android.instantwin.presentation.penalty;

import android.content.Intent;
import android.os.Bundle;
import defpackage.aqe0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.elf;
import defpackage.fgo;
import defpackage.fqk;
import defpackage.g4m;
import defpackage.jlo;
import defpackage.jq40;
import defpackage.kt9;
import defpackage.ku90;
import defpackage.mgb0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.vho;
import defpackage.wuc0;
import defpackage.xuc0;
import defpackage.zn8;
import defpackage.zpe0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/penalty/SportyPenaltyActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyPenaltyActivity extends g4m implements rlf, bb40 {
    public static final /* synthetic */ int w = 0;
    public final q8i0 b = new q8i0(jq40.a(d.class), new b(), new a(), new c());
    public vho c;
    public mgb0 d;
    public fgo e;
    public jlo f;
    public azm i;
    public ee<fqk> v;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyPenaltyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyPenaltyActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyPenaltyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zpe0 zpe0Var = zpe0.a;
        elf.a(this, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        zn8.a(this, kt9.c);
        vho vhoVar = this.c;
        if (vhoVar == null) {
            Intrinsics.n("instantWinOnlineImagePreloader");
            throw null;
        }
        vhoVar.a();
        jlo jloVar = this.f;
        if (jloVar == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        this.v = registerForActivityResult(jloVar.a(), new wuc0(this));
        ku90<com.sportybet.android.instantwin.presentation.penalty.c> ku90Var = z1().R;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new xuc0(this, ku90Var, null, this), 3);
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        z1().z1(com.sportybet.android.instantwin.presentation.penalty.b.n.a);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        z1().z1(com.sportybet.android.instantwin.presentation.penalty.b.InterfaceC0294b.C0295b.a);
    }

    public final d z1() {
        return (d) this.b.getValue();
    }
}
