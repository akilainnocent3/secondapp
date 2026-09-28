package com.sporty.android.platform.features.luckywheel;

import android.os.Bundle;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.luckywheel.LuckyWheelColor;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.ccu;
import defpackage.cyb;
import defpackage.dwl;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.hbu;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.lyh;
import defpackage.m2g;
import defpackage.m850;
import defpackage.myh;
import defpackage.n8u;
import defpackage.op8;
import defpackage.p6f;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rtf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.y5b;
import defpackage.zi50;
import defpackage.zn8;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/platform/features/luckywheel/LuckyWheelActivity;", "Lpy1;", "Lbb40;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LuckyWheelActivity extends dwl implements bb40 {
    public static final /* synthetic */ int e = 0;
    public final q8i0 b = new q8i0(jq40.a(ccu.class), new c(), new b(), new d());
    public final q8i0 c = new q8i0(jq40.a(p6f.class), new f(), new e(), new g());
    public azm d;

    @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "LuckyWheelActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LuckyWheelActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ LuckyWheelActivity d;

        /* JADX INFO: renamed from: com.sporty.android.platform.features.luckywheel.LuckyWheelActivity$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        @c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "LuckyWheelActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0207a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ LuckyWheelActivity d;

            /* JADX INFO: renamed from: com.sporty.android.platform.features.luckywheel.LuckyWheelActivity$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes5.dex */
            public static final class C0208a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ LuckyWheelActivity b;

                public C0208a(v5b v5bVar, LuckyWheelActivity luckyWheelActivity) {
                    this.b = luckyWheelActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    n8u n8uVar = (n8u) t;
                    if (!Intrinsics.g(n8uVar, n8u.a.a) && !Intrinsics.g(n8uVar, n8u.b.a)) {
                        uhc.a();
                        return null;
                    }
                    azm azmVar = this.b.d;
                    if (azmVar != null) {
                        azmVar.d(wae.HOME);
                        return Unit.a;
                    }
                    Intrinsics.n("router");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0207a(lyh lyhVar, v1b v1bVar, LuckyWheelActivity luckyWheelActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = luckyWheelActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0207a c0207a = new C0207a(this.c, v1bVar, this.d);
                c0207a.b = obj;
                return c0207a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0207a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0208a c0208a = new C0208a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0208a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a(llGRV.tkxstev);
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LuckyWheelActivity luckyWheelActivity, lyh lyhVar, v1b v1bVar, LuckyWheelActivity luckyWheelActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = luckyWheelActivity;
            this.c = lyhVar;
            this.d = luckyWheelActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, this.c, v1bVar, this.d);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C0207a c0207a = new C0207a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0207a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
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
            return LuckyWheelActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LuckyWheelActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LuckyWheelActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LuckyWheelActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LuckyWheelActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LuckyWheelActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [p6f] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Collection] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ?? arrayList;
        super.onCreate(bundle);
        zn8.a(this, new op8(-1314647968, new rtf(this), true));
        q8i0 q8i0Var = this.b;
        ccu ccuVar = (ccu) q8i0Var.getValue();
        Iterator<LuckyWheelColor> it = LuckyWheelColor.getEntries().iterator();
        while (it.hasNext()) {
            ccuVar.e.f(it.next().getPath(), null);
        }
        hbu hbuVar = ((ccu) q8i0Var.getValue()).b;
        List list = (List) hbuVar.b.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            File fileA = hbu.a(this, (String) obj);
            if (!fileA.exists() || !fileA.canRead() || fileA.length() <= 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Collection collectionValues = ((Map) hbuVar.a.getValue()).values();
            arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (arrayList2.contains(((Pair) obj2).b)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = m2g.a;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ?? r1 = arrayList;
        if (zIsEmpty) {
            r1 = 0;
        }
        if (r1 != 0) {
            try {
                zi50.a aVar = zi50.b;
                ((p6f) this.c.getValue()).x1(this, r1);
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
        }
        t340 t340Var = ((ccu) q8i0Var.getValue()).z;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, t340Var, null, this), 3);
    }
}
