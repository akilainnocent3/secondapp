package com.sportybet.feature.luckynumber.luncher;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberActivity;
import defpackage.arq;
import defpackage.arr;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.g1i;
import defpackage.jq40;
import defpackage.l5u;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uxo;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.y5b;
import defpackage.zi50;
import defpackage.zvl;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/luckynumber/luncher/LuckyNumberLuncherActivity;", "Lpy1;", "<init>", "()V", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LuckyNumberLuncherActivity extends zvl {
    public static final /* synthetic */ int d = 0;
    public arq b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.luckynumber.luncher.c.class), new c(), new b(), new d());

    @c0d(c = "com.sportybet.feature.luckynumber.luncher.LuckyNumberLuncherActivity$onCreate$1", f = "LuckyNumberLuncherActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<com.sportybet.feature.luckynumber.luncher.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = LuckyNumberLuncherActivity.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sportybet.feature.luckynumber.luncher.a aVar, v1b<? super Unit> v1bVar) {
            return ((a) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.feature.luckynumber.luncher.a aVar = (com.sportybet.feature.luckynumber.luncher.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(aVar, com.sportybet.feature.luckynumber.luncher.a.d.a)) {
                boolean z = aVar instanceof com.sportybet.feature.luckynumber.luncher.a.b;
                int i = 0;
                LuckyNumberLuncherActivity luckyNumberLuncherActivity = LuckyNumberLuncherActivity.this;
                if (z) {
                    Intent intent = new Intent(luckyNumberLuncherActivity, (Class<?>) LuckyNumberActivity.class);
                    intent.setFlags(335544320);
                    int i2 = LuckyNumberLuncherActivity.d;
                    Sender senderZ1 = luckyNumberLuncherActivity.z1();
                    if (senderZ1 != null) {
                        intent.putExtra("key_sender", senderZ1);
                    }
                    intent.putExtra("key-lucky-number-gif-id", luckyNumberLuncherActivity.getIntent().getStringExtra("key-lucky-number-gif-id"));
                    n5u n5uVar = n5u.a;
                    l5u l5uVar = ((com.sportybet.feature.luckynumber.luncher.a.b) aVar).a;
                    n5uVar.getClass();
                    l5uVar.getClass();
                    intent.putExtra("key-raw-query", CollectionsKt.a0(n5u.c(l5uVar), "&", null, null, new m5u(i), 30));
                    luckyNumberLuncherActivity.startActivity(intent);
                    luckyNumberLuncherActivity.finish();
                } else if (aVar instanceof com.sportybet.feature.luckynumber.luncher.a.c) {
                    Intent intent2 = (Intent) uxo.a(luckyNumberLuncherActivity.getIntent(), "lucky number web view intent", Intent.class);
                    if (intent2 != null) {
                        intent2.putExtra("data_enable_default_action_bar", false);
                    }
                    if (intent2 != null) {
                        intent2.putExtra("url", ((com.sportybet.feature.luckynumber.luncher.a.c) aVar).a);
                    }
                    if (intent2 != null) {
                        try {
                            zi50.a aVar2 = zi50.b;
                            luckyNumberLuncherActivity.startActivity(intent2);
                            Unit unit = Unit.a;
                        } catch (Throwable unused) {
                            zi50.a aVar3 = zi50.b;
                        }
                    }
                    luckyNumberLuncherActivity.finish();
                } else {
                    if (!Intrinsics.g(aVar, com.sportybet.feature.luckynumber.luncher.a.C0407a.a)) {
                        uhc.a();
                        return null;
                    }
                    luckyNumberLuncherActivity.finish();
                }
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LuckyNumberLuncherActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LuckyNumberLuncherActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LuckyNumberLuncherActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arq arqVar = this.b;
        if (arqVar == null) {
            Intrinsics.n("loginBinder");
            throw null;
        }
        arqVar.a(this);
        g1i g1iVar = new g1i(((com.sportybet.feature.luckynumber.luncher.c) this.c.getValue()).f, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final Sender z1() {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Sender) getIntent().getSerializableExtra("lucky number sender", Sender.class);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("lucky number sender");
        if (serializableExtra instanceof Sender) {
            return (Sender) serializableExtra;
        }
        return null;
    }
}
