package com.sportybet.feature.facialrecognition.presentation;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.WgU.PSAHO;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.pocket.globalpay.HNZU.MiEqxQsUF;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.feature.facialrecognition.presentation.c;
import com.sportybet.feature.facialrecognition.presentation.g;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import defpackage.a390;
import defpackage.au7;
import defpackage.c0d;
import defpackage.cny;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fkd;
import defpackage.hkd;
import defpackage.hzh;
import defpackage.ib5;
import defpackage.id90;
import defpackage.j6h;
import defpackage.jq40;
import defpackage.js;
import defpackage.jv5;
import defpackage.jvd0;
import defpackage.l6h;
import defpackage.m2g;
import defpackage.m6h;
import defpackage.m850;
import defpackage.myh;
import defpackage.n6h;
import defpackage.o7h;
import defpackage.o8i0;
import defpackage.p6h;
import defpackage.p7h;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rjc;
import defpackage.s0i;
import defpackage.s9s;
import defpackage.sjc;
import defpackage.tjc;
import defpackage.tje0;
import defpackage.to20;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vdc;
import defpackage.vu60;
import defpackage.wt7;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xql;
import defpackage.y5b;
import defpackage.zyf0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/facialrecognition/presentation/FacialRecognitionActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "Lto20;", "Lpwx;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FacialRecognitionActivity extends xql implements to20, pwx {
    public static final /* synthetic */ int f = 0;
    public androidx.appcompat.app.b d;
    public final q8i0 b = new q8i0(jq40.a(au7.class), new i(), new h(), new j());
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.facialrecognition.presentation.c.class), new l(), new k(), new m());
    public final g e = new g(false);

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "FacialRecognitionActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FacialRecognitionActivity b;
        public final /* synthetic */ FacialRecognitionActivity c;

        /* JADX INFO: renamed from: com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "FacialRecognitionActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class C0359a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FacialRecognitionActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0359a(v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
                super(2, v1bVar);
                this.c = facialRecognitionActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0359a c0359a = new C0359a(v1bVar, this.c);
                c0359a.b = obj;
                return c0359a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((C0359a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    FacialRecognitionActivity facialRecognitionActivity = this.c;
                    a390<String> facialRecognitionSdkResult = ((WebViewActivity) facialRecognitionActivity).webViewViewModel.getFacialRecognitionSdkResult();
                    d dVar = facialRecognitionActivity.new d();
                    this.b = null;
                    this.a = 1;
                    if (facialRecognitionSdkResult.collect(dVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                fkd.a();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FacialRecognitionActivity facialRecognitionActivity, v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = facialRecognitionActivity;
            this.c = facialRecognitionActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, v1bVar, this.c);
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
                C0359a c0359a = new C0359a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0359a, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2", f = "FacialRecognitionActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FacialRecognitionActivity b;
        public final /* synthetic */ FacialRecognitionActivity c;

        @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2$1", f = "FacialRecognitionActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FacialRecognitionActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
                super(2, v1bVar);
                this.c = facialRecognitionActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$b$a for r5v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L18
                    if (r1 == r2) goto L14
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r3
                L14:
                    defpackage.uj50.b(r6)
                    goto L37
                L18:
                    defpackage.uj50.b(r6)
                    int r6 = com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity.f
                    com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity r6 = r5.c
                    com.sportybet.feature.facialrecognition.presentation.c r1 = r6.I1()
                    v340 r1 = r1.b
                    com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$e r4 = new com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$e
                    r4.<init>()
                    r5.b = r3
                    r5.a = r2
                    uwd0<T> r6 = r1.a
                    java.lang.Object r5 = r6.collect(r4, r5)
                    if (r5 != r0) goto L37
                    return r0
                L37:
                    defpackage.fkd.a()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FacialRecognitionActivity facialRecognitionActivity, v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = facialRecognitionActivity;
            this.c = facialRecognitionActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$3", f = "FacialRecognitionActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FacialRecognitionActivity b;
        public final /* synthetic */ FacialRecognitionActivity c;

        @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$3$1", f = "FacialRecognitionActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FacialRecognitionActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
                super(2, v1bVar);
                this.c = facialRecognitionActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$c$a for r5v2 'this'  v1b
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.b
                    v5b r0 = (defpackage.v5b) r0
                    y5b r0 = defpackage.y5b.a
                    int r1 = r5.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L18
                    if (r1 == r2) goto L14
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r5)
                    return r3
                L14:
                    defpackage.uj50.b(r6)
                    goto L37
                L18:
                    defpackage.uj50.b(r6)
                    int r6 = com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity.f
                    com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity r6 = r5.c
                    com.sportybet.feature.facialrecognition.presentation.c r1 = r6.I1()
                    t340 r1 = r1.d
                    com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$f r4 = new com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$f
                    r4.<init>()
                    r5.b = r3
                    r5.a = r2
                    a390<T> r6 = r1.a
                    java.lang.Object r5 = r6.collect(r4, r5)
                    if (r5 != r0) goto L37
                    return r0
                L37:
                    defpackage.fkd.a()
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FacialRecognitionActivity facialRecognitionActivity, v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = facialRecognitionActivity;
            this.c = facialRecognitionActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new c(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d<T> implements myh {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            String str = (String) obj;
            int i = FacialRecognitionActivity.f;
            com.sportybet.feature.facialrecognition.presentation.c cVarI1 = FacialRecognitionActivity.this.I1();
            str.getClass();
            wwd0 wwd0Var = cVarI1.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, p7h.a((p7h) value, true)));
            jvd0 jvd0Var = cVarI1.z;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            cVarI1.z = ej5.c(o8i0.d(cVarI1), null, null, new com.sportybet.feature.facialrecognition.presentation.h(str, cVarI1, null), 3);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e<T> implements myh {
        public e() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int i = FacialRecognitionActivity.f;
            FacialRecognitionActivity.this.K1((p7h) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f<T> implements myh {

        @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$onCreate$3$1", f = "FacialRecognitionActivity.kt", l = {75}, m = "emit", v = 2)
        public static final class a extends x1b {
            public o7h.d a;
            public /* synthetic */ Object b;
            public final /* synthetic */ f<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.c = fVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(id90 id90Var, v1b<? super Unit> v1bVar) {
            a aVar;
            androidx.appcompat.app.b bVar;
            String str;
            ActivityOptions activityOptionsA;
            id90 id90Var2 = id90Var;
            final FacialRecognitionActivity facialRecognitionActivity = FacialRecognitionActivity.this;
            q8i0 q8i0Var = facialRecognitionActivity.b;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, v1bVar);
                }
            } else {
                aVar = new a(this, v1bVar);
            }
            Object obj = aVar.b;
            Object obj2 = y5b.a;
            int i2 = aVar.d;
            int i3 = 1;
            if (i2 == 0) {
                uj50.b(obj);
                if (id90Var2 instanceof o7h.c) {
                    o7h.c cVar = (o7h.c) id90Var2;
                    int i4 = FacialRecognitionActivity.f;
                    ej5.c(ebs.a(facialRecognitionActivity.getLifecycle()), null, null, new l6h(facialRecognitionActivity, cVar, null), 3);
                } else if (id90Var2 instanceof o7h.a) {
                    int i5 = FacialRecognitionActivity.f;
                    androidx.appcompat.app.b bVar2 = facialRecognitionActivity.d;
                    if (bVar2 != null) {
                        bVar2.dismiss();
                    }
                    facialRecognitionActivity.d = null;
                    Intent intent = new Intent();
                    intent.putExtra("facial-recognition-result", ((o7h.a) id90Var2).a);
                    facialRecognitionActivity.setResult(-1, intent);
                    facialRecognitionActivity.finish();
                } else if (id90Var2 instanceof o7h.d) {
                    int i6 = FacialRecognitionActivity.f;
                    au7 au7Var = (au7) q8i0Var.getValue();
                    aVar.a = (o7h.d) id90Var2;
                    aVar.d = 1;
                    Object objD = ej5.d(au7Var.b, new wt7(au7Var, null), aVar);
                    if (objD != obj2) {
                        objD = Unit.a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
                } else if (id90Var2 instanceof o7h.b) {
                    String str2 = ((o7h.b) id90Var2).a;
                    int i7 = FacialRecognitionActivity.f;
                    Uri uri = Uri.parse(str2);
                    m2g m2gVar = m2g.a;
                    PackageManager packageManager = facialRecognitionActivity.getPackageManager();
                    List arrayList = m2gVar == null ? new ArrayList() : m2gVar;
                    ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
                    if (resolveInfoResolveActivity != null) {
                        String str3 = resolveInfoResolveActivity.activityInfo.packageName;
                        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
                        arrayList2.add(str3);
                        if (m2gVar != null) {
                            arrayList2.addAll(m2gVar);
                        }
                        arrayList = arrayList2;
                    }
                    Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            if (Build.VERSION.SDK_INT >= 30) {
                                Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                            }
                            str = null;
                            break;
                        }
                        str = (String) it.next();
                        intent2.setPackage(str);
                    } while (packageManager.resolveService(intent2, 0) == null);
                    if (str == null) {
                        uri.getClass();
                        facialRecognitionActivity.J1(uri);
                    } else {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                        intent3.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                            Bundle bundle = new Bundle();
                            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                            intent3.putExtras(bundle);
                        }
                        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                        intent3.putExtras(new Bundle());
                        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        String strA = sjc.a();
                        if (!TextUtils.isEmpty(strA)) {
                            Bundle bundleExtra = intent3.hasExtra("com.android.browser.headers") ? intent3.getBundleExtra("com.android.browser.headers") : new Bundle();
                            if (!bundleExtra.containsKey("Accept-Language")) {
                                bundleExtra.putString("Accept-Language", strA);
                                intent3.putExtra("com.android.browser.headers", bundleExtra);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 34) {
                            activityOptionsA = rjc.a();
                            tjc.a(activityOptionsA, false);
                        } else {
                            activityOptionsA = null;
                        }
                        Bundle bundle2 = activityOptionsA != null ? activityOptionsA.toBundle() : null;
                        intent3.setPackage(str);
                        try {
                            intent3.setData(uri);
                            facialRecognitionActivity.startActivity(intent3, bundle2);
                        } catch (ActivityNotFoundException unused) {
                            uri.getClass();
                            facialRecognitionActivity.J1(uri);
                        }
                    }
                } else if (Intrinsics.g(id90Var2, o7h.e.a)) {
                    int i8 = FacialRecognitionActivity.f;
                    if (!facialRecognitionActivity.isFinishing() && !facialRecognitionActivity.isDestroyed() && ((bVar = facialRecognitionActivity.d) == null || !bVar.isShowing())) {
                        final androidx.appcompat.app.b bVarB = js.b(facialRecognitionActivity, facialRecognitionActivity.getCMSString(R.string.common_functions__error, new Object[0]), facialRecognitionActivity.getCMSString(R.string.common_feedback__facial_recognition_error, new Object[0]), facialRecognitionActivity.getCMSString(R.string.common_functions__retry, new Object[0]), facialRecognitionActivity.getCMSString(R.string.common_functions__cancel, new Object[0]), new vdc(facialRecognitionActivity, i3), new m6h(0, facialRecognitionActivity.I1(), com.sportybet.feature.facialrecognition.presentation.c.class, "onRecoveryCanceled", "onRecoveryCanceled()V", 0), 8);
                        facialRecognitionActivity.d = bVarB;
                        bVarB.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: h6h
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                int i9 = FacialRecognitionActivity.f;
                                c cVarI1 = facialRecognitionActivity.I1();
                                jvd0 jvd0Var = cVarI1.z;
                                if (jvd0Var != null) {
                                    jvd0Var.cancel((CancellationException) null);
                                }
                                ej5.c(o8i0.d(cVarI1), null, null, new g(cVarI1, null), 3);
                            }
                        });
                        bVarB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i6h
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                b bVar3 = bVarB;
                                FacialRecognitionActivity facialRecognitionActivity2 = facialRecognitionActivity;
                                if (facialRecognitionActivity2.d == bVar3) {
                                    facialRecognitionActivity2.d = null;
                                }
                            }
                        });
                    }
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            id90Var2 = aVar.a;
            uj50.b(obj);
            int i9 = FacialRecognitionActivity.f;
            ((au7) q8i0Var.getValue()).x1(((o7h.d) id90Var2).a);
            s9s.b bVar3 = s9s.b.a;
            ej5.c(ebs.a(facialRecognitionActivity.getLifecycle()), null, null, new j6h(facialRecognitionActivity, null, facialRecognitionActivity), 3);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends cny {
        @Override // defpackage.cny
        public final void b() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return FacialRecognitionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return FacialRecognitionActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return FacialRecognitionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return FacialRecognitionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<v8i0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return FacialRecognitionActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class m extends qlr implements Function0<cyb> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return FacialRecognitionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final com.sportybet.feature.facialrecognition.presentation.c I1() {
        return (com.sportybet.feature.facialrecognition.presentation.c) this.c.getValue();
    }

    public final void J1(Uri uri) {
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        intentAddCategory.getClass();
        try {
            startActivity(intentAddCategory);
            com.sportybet.feature.facialrecognition.presentation.c cVarI1 = I1();
            cVarI1.H1(new com.sportybet.feature.facialrecognition.presentation.a.e(cVarI1.A1(), com.sportybet.feature.facialrecognition.presentation.b.a(cVarI1.C1()), uri.getHost()));
        } catch (ActivityNotFoundException unused) {
            zyf0.a(R.string.app_common__unable_to_find_application_to_perform_this_action);
            com.sportybet.feature.facialrecognition.presentation.c cVarI2 = I1();
            ej5.c(o8i0.d(cVarI2), null, null, new com.sportybet.feature.facialrecognition.presentation.e(cVarI2, null), 3);
        }
    }

    public final void K1(p7h p7hVar) {
        this.e.f(p7hVar.b);
        AppCompatImageView leftCloseButton = getLeftCloseButton();
        if (leftCloseButton != null) {
            leftCloseButton.setEnabled(!p7hVar.b);
        }
        boolean z = p7hVar.a;
        WebView webView = this.webView;
        if (z) {
            webView.getClass();
            webView.setVisibility(8);
            LoadingViewNew loadingViewNew = this.loadingView;
            loadingViewNew.getClass();
            loadingViewNew.setVisibility(0);
            return;
        }
        webView.getClass();
        webView.setVisibility(0);
        LoadingViewNew loadingViewNew2 = this.loadingView;
        loadingViewNew2.getClass();
        loadingViewNew2.setVisibility(8);
    }

    public final void L1(com.sportybet.feature.facialrecognition.presentation.a.k kVar) {
        com.sportybet.feature.facialrecognition.presentation.c cVarI1 = I1();
        boolean zIsFinishing = isFinishing();
        boolean zIsChangingConfigurations = isChangingConfigurations();
        String strA1 = cVarI1.A1();
        com.sportybet.feature.facialrecognition.presentation.a.l lVarB1 = cVarI1.B1();
        vu60 vu60Var = cVarI1.y;
        Boolean bool = (Boolean) vu60Var.b("hasLaunchedFacialRecognition");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) vu60Var.b("awaitingUnicoCallback");
        cVarI1.H1(new com.sportybet.feature.facialrecognition.presentation.a.C0360a(strA1, kVar, lVarB1, zBooleanValue, bool2 != null ? bool2.booleanValue() : false, zIsFinishing, zIsChangingConfigurations));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:27:0x0074). Please report as a decompilation issue!!! */
    public final Object M1(int i2, x1b x1bVar) {
        n6h n6hVar;
        int i3;
        ?? r2;
        int i4;
        int i5;
        ?? r3;
        int i6;
        if (x1bVar instanceof n6h) {
            n6hVar = (n6h) x1bVar;
            int i7 = n6hVar.f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                n6hVar.f = i7 - Integer.MIN_VALUE;
            } else {
                n6hVar = new n6h(this, x1bVar);
            }
        } else {
            n6hVar = new n6h(this, x1bVar);
        }
        Object objA = n6hVar.d;
        y5b y5bVar = y5b.a;
        int i8 = n6hVar.f;
        if (i8 == 0) {
            uj50.b(objA);
            i3 = 0;
            r2 = 0;
            if (r2 == 0 || i3 >= i2) {
                if (r2 == 0) {
                    com.sportybet.feature.facialrecognition.presentation.c cVarI1 = I1();
                    ej5.c(o8i0.d(cVarI1), null, null, new com.sportybet.feature.facialrecognition.presentation.i(cVarI1, null), 3);
                }
                return Unit.a;
            }
            n6hVar.a = i2;
            n6hVar.b = r2;
            n6hVar.c = i3;
            n6hVar.f = 1;
            if (hkd.b(500L, n6hVar) != y5bVar) {
                i5 = i2;
                i4 = i3;
                r3 = r2;
                jv5 jv5VarA = hzh.a(new p6h(null, this));
                n6hVar.a = i5;
                n6hVar.b = r3;
                n6hVar.c = i4;
                n6hVar.f = 2;
                objA = s0i.a(jv5VarA, n6hVar);
                if (objA != y5bVar) {
                    i6 = i5;
                }
            }
            return y5bVar;
        }
        if (i8 == 1) {
            i4 = n6hVar.c;
            int i9 = n6hVar.b;
            i5 = n6hVar.a;
            uj50.b(objA);
            r3 = i9;
            jv5 jv5VarA2 = hzh.a(new p6h(null, this));
            n6hVar.a = i5;
            n6hVar.b = r3;
            n6hVar.c = i4;
            n6hVar.f = 2;
            objA = s0i.a(jv5VarA2, n6hVar);
            if (objA != y5bVar) {
                i6 = i5;
            }
            return y5bVar;
        }
        if (i8 != 2) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i4 = n6hVar.c;
        i6 = n6hVar.a;
        uj50.b(objA);
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        i3 = i4 + 1;
        i2 = i6;
        r2 = zBooleanValue;
        if (r2 == 0) {
        }
        if (r2 == 0) {
            com.sportybet.feature.facialrecognition.presentation.c cVarI2 = I1();
            ej5.c(o8i0.d(cVarI2), null, null, new com.sportybet.feature.facialrecognition.presentation.i(cVarI2, null), 3);
        }
        return Unit.a;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity
    public final boolean allowCameraPermissionRequest() {
        return true;
    }

    @Override // defpackage.fq0, defpackage.yn8, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (this.e.a && keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.OSXQdrIy.invoke(null, this, bundle);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.VhaJrfViUHdSvz.invoke(null, this);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        L1(com.sportybet.feature.facialrecognition.presentation.a.k.OnNewIntent);
        if (!I1().D1(intent.getData())) {
            super.onNewIntent(intent);
            return;
        }
        androidx.appcompat.app.b bVar = this.d;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.d = null;
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() throws IllegalAccessException, InvocationTargetException {
        PSAHO.CjYCACGWoX.invoke(null, this);
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.yrPOtbSwoAaR.invoke(null, this);
    }
}
