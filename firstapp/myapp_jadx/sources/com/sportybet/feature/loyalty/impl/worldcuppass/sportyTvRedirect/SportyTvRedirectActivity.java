package com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.lyh;
import defpackage.m850;
import defpackage.myh;
import defpackage.op8;
import defpackage.q4m;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.y5b;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/worldcuppass/sportyTvRedirect/SportyTvRedirectActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyTvRedirectActivity extends q4m implements rlf, bb40 {
    public static final /* synthetic */ int c = 0;
    public final q8i0 b = new q8i0(jq40.a(com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.b.class), new d(), new c(), new e());

    public static final class a {
        public static Intent a(Context context) {
            context.getClass();
            return new Intent(context, (Class<?>) SportyTvRedirectActivity.class);
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "SportyTvRedirectActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SportyTvRedirectActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ SportyTvRedirectActivity d;

        @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "SportyTvRedirectActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ SportyTvRedirectActivity d;

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0401a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ SportyTvRedirectActivity b;

                public C0401a(v5b v5bVar, SportyTvRedirectActivity sportyTvRedirectActivity) {
                    this.b = sportyTvRedirectActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    ActivityInfo activityInfo;
                    com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a aVar = (com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a) t;
                    int i = SportyTvRedirectActivity.c;
                    boolean z = aVar instanceof com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a.b;
                    String str = null;
                    SportyTvRedirectActivity sportyTvRedirectActivity = this.b;
                    if (z) {
                        com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a.b bVar = (com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a.b) aVar;
                        String str2 = bVar.a;
                        String str3 = bVar.b;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                        intent.setPackage(str3);
                        intent.addFlags(268435456);
                        try {
                            sportyTvRedirectActivity.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q("SportyTvRedirect");
                            aVar2.g("SportyTV app not installed; falling back to system browser", new Object[0]);
                            ResolveInfo resolveInfoResolveActivity = sportyTvRedirectActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 65536);
                            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                                str = activityInfo.packageName;
                            }
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                            intent2.addFlags(268435456);
                            if (str != null) {
                                intent2.setPackage(str);
                            }
                            try {
                                sportyTvRedirectActivity.startActivity(intent2);
                            } catch (ActivityNotFoundException unused2) {
                                itf0.a aVar3 = itf0.a;
                                aVar3.q("SportyTvRedirect");
                                aVar3.n("No browser available to handle SportyTV fallback URL", new Object[0]);
                            }
                        }
                        sportyTvRedirectActivity.finish();
                    } else {
                        if (!Intrinsics.g(aVar, com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a.C0402a.a)) {
                            uhc.a();
                            return null;
                        }
                        sportyTvRedirectActivity.finish();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, SportyTvRedirectActivity sportyTvRedirectActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = sportyTvRedirectActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0401a c0401a = new C0401a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0401a, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SportyTvRedirectActivity sportyTvRedirectActivity, lyh lyhVar, v1b v1bVar, SportyTvRedirectActivity sportyTvRedirectActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = sportyTvRedirectActivity;
            this.c = lyhVar;
            this.d = sportyTvRedirectActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, this.c, v1bVar, this.d);
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
                a aVar = new a(this.c, null, this.d);
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

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyTvRedirectActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyTvRedirectActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyTvRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t340 t340Var = ((com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.b) this.b.getValue()).d;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new b(this, t340Var, null, this), 3);
        zn8.a(this, new op8(-2000779603, new Function2() { // from class: xed0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = SportyTvRedirectActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final SportyTvRedirectActivity sportyTvRedirectActivity = this.a;
                    o0z.a(null, null, null, null, null, pp8.b(346641500, new Function2() { // from class: yed0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = SportyTvRedirectActivity.c;
                            int i3 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                SportyTvRedirectActivity sportyTvRedirectActivity2 = sportyTvRedirectActivity;
                                boolean zA = aVar2.A(sportyTvRedirectActivity2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new z00(sportyTvRedirectActivity2, i3);
                                    aVar2.r(objY);
                                }
                                q3k0.b((Function0) objY, aVar2, 0);
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
}
