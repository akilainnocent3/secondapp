package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import tgj.f;
import tgj.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0012²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ltgj;", "Lfgb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "c", "a", "", "giftResponseReceived", "showBlur", "", "brightness", "rotation", "showStar", "hideUfo", "", "currentIndex", "nextIndex", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class tgj extends fgb {
    public final ytw<Boolean> y2 = m.b(Boolean.FALSE);
    public final ytw<Integer> z2 = m.b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("Idle", 0);
            a aVar2 = new a("Flying", 1);
            a = aVar2;
            b = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$MultiplierComponents$1$1", f = "GalaxyGoFragment.kt", l = {1258, 1265, 1271, 1287, 1296, 1297, 1300, 1305, 1313}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public jvd0 a;
        public jvd0 b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String e;
        public final /* synthetic */ wd0<Float, ij0> f;
        public final /* synthetic */ wd0<Float, ij0> i;
        public final /* synthetic */ wd0<Float, ij0> v;
        public final /* synthetic */ ytw<Boolean> w;
        public final /* synthetic */ ytw<Boolean> y;

        @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$MultiplierComponents$1$1$scaleJob$1", f = "GalaxyGoFragment.kt", l = {1278}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
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
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(120, 0, xkf.a, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        /* JADX INFO: renamed from: tgj$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$MultiplierComponents$1$1$starScaleJob$1", f = "GalaxyGoFragment.kt", l = {1289}, m = "invokeSuspend", v = 1)
        public static final class C1138b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1138b(wd0<Float, ij0> wd0Var, v1b<? super C1138b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1138b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1138b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    Float f = new Float(0.3f);
                    gzg0 gzg0VarE = yi0.e(120, 0, xkf.d, 2);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
        public b(String str, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
            this.f = wd0Var;
            this.i = wd0Var2;
            this.v = wd0Var3;
            this.w = ytwVar;
            this.y = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00eb A[PHI: r10
          0x00eb: PHI (r10v4 ??) = (r10v18 ??), (r10v5 ??) binds: [B:27:0x00e7, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x0111 A[PHI: r0 r10
          0x0111: PHI (r0v25 jvd0) = (r0v24 jvd0), (r0v28 jvd0) binds: [B:30:0x010d, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]
          0x0111: PHI (r10v6 ??) = (r10v17 ??), (r10v7 ??) binds: [B:30:0x010d, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x012d  */
        /* JADX WARN: Code duplicated, block: B:39:0x013f A[PHI: r10
          0x013f: PHI (r10v10 ??) = (r10v15 ??), (r10v11 ??) binds: [B:37:0x013b, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x0165 A[PHI: r10
          0x0165: PHI (r10v12 ??) = (r10v14 ??), (r10v13 ??) binds: [B:40:0x0162, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        
            if (r0 == r8) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0186, code lost:
        
            if (r0 == r8) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01ad, code lost:
        
            if (r0 == r8) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, jvd0] */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, jvd0] */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v4, types: [a6b, kotlin.coroutines.CoroutineContext, v1b] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6, types: [a6b, java.lang.Object, jvd0, kotlin.coroutines.CoroutineContext, v1b] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, jvd0] */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tgj.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final float c;
        public final float d;
        public final float e;

        public c(String str, int i, float f, float f2, float f3) {
            str.getClass();
            this.a = str;
            this.b = i;
            this.c = f;
            this.d = f2;
            this.e = f3;
        }

        public static c a(c cVar, int i, float f, float f2, float f3) {
            String str = cVar.a;
            cVar.getClass();
            str.getClass();
            return new c(str, i, f, f2, f3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.e) + tvh.a(this.d, tvh.a(this.c, gpp.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sbA = ml5.a(this.b, "Planet(imageRes=", this.a, ", pathIndex=", ", progress=");
            ew7.b(sbA, this.c, ", opacity=", this.d, ", scale=");
            return wi1.a(this.e, ")", sbA);
        }
    }

    @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$SetEarthBackgroundView$1$1", f = "GalaxyGoFragment.kt", l = {817}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw<Boolean> ytwVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tgj.this.new d(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (((Boolean) ((x5a0) tgj.this.i0).getValue()).booleanValue()) {
                    this.a = 1;
                    if (hkd.b(300L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    ytwVar.setValue(Boolean.FALSE);
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ytwVar.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$SpeedLinesAnimation$1$1", f = "GalaxyGoFragment.kt", l = {1583, 1584, 1594}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ List<String> e;
        public final /* synthetic */ osw f;
        public final /* synthetic */ osw i;

        @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$SpeedLinesAnimation$1$1$1", f = "GalaxyGoFragment.kt", l = {1587}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wd0<Float, ij0> wd0Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
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
                    Float f = new Float(0.0f);
                    gzg0 gzg0VarE = yi0.e(50, 0, null, 6);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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

        @c0d(c = "com.sportygames.galaxygo.views.GalaxyGoFragment$SpeedLinesAnimation$1$1$2", f = "GalaxyGoFragment.kt", l = {1590}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ wd0<Float, ij0> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(wd0<Float, ij0> wd0Var, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
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
                    Float f = new Float(1.0f);
                    gzg0 gzg0VarE = yi0.e(50, 0, null, 6);
                    this.a = 1;
                    if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
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
        public e(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, List<String> list, osw oswVar, osw oswVar2, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = wd0Var;
            this.d = wd0Var2;
            this.e = list;
            this.f = oswVar;
            this.i = oswVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(this.c, this.d, this.e, this.f, this.i, v1bVar);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if (defpackage.hkd.b(50, r9) == r1) goto L20;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.b
                v5b r0 = (defpackage.v5b) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r9.a
                wd0<java.lang.Float, ij0> r3 = r9.d
                wd0<java.lang.Float, ij0> r4 = r9.c
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L2a
                if (r2 == r8) goto L26
                if (r2 == r6) goto L22
                if (r2 != r5) goto L1c
                defpackage.uj50.b(r10)
                goto L6d
            L1c:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r7
            L22:
                defpackage.uj50.b(r10)
                goto L50
            L26:
                defpackage.uj50.b(r10)
                goto L3e
            L2a:
                defpackage.uj50.b(r10)
                java.lang.Float r10 = new java.lang.Float
                r2 = 0
                r10.<init>(r2)
                r9.b = r0
                r9.a = r8
                java.lang.Object r10 = r4.f(r9, r10)
                if (r10 != r1) goto L3e
                goto L6c
            L3e:
                java.lang.Float r10 = new java.lang.Float
                r2 = 1065353216(0x3f800000, float:1.0)
                r10.<init>(r2)
                r9.b = r0
                r9.a = r6
                java.lang.Object r10 = r3.f(r9, r10)
                if (r10 != r1) goto L50
                goto L6c
            L50:
                tgj$e$a r10 = new tgj$e$a
                r10.<init>(r3, r7)
                defpackage.ej5.c(r0, r7, r7, r10, r5)
                tgj$e$b r10 = new tgj$e$b
                r10.<init>(r4, r7)
                defpackage.ej5.c(r0, r7, r7, r10, r5)
                r9.b = r7
                r9.a = r5
                r2 = 50
                java.lang.Object r10 = defpackage.hkd.b(r2, r9)
                if (r10 != r1) goto L6d
            L6c:
                return r1
            L6d:
                osw r10 = r9.i
                osw r0 = r9.f
                int r1 = r0.D()
                r10.k(r1)
                int r10 = r0.D()
                int r10 = r10 + r8
                java.util.List<java.lang.String> r9 = r9.e
                int r9 = r9.size()
                int r10 = r10 % r9
                r0.k(r10)
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tgj.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class f implements Function2<String, j58, Unit> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            tgj tgjVar = tgj.this;
            if (!((Boolean) ((x5a0) tgjVar.d1).getValue()).booleanValue()) {
                ((x5a0) tgjVar.c1().H).setValue(str2);
                ((x5a0) tgjVar.c1().K).setValue(j58Var2);
                ((x5a0) tgjVar.c1().L).setValue(new j58(j58.f));
                ((x5a0) tgjVar.c1().Q).setValue(2000);
                ((x5a0) tgjVar.c1().O).setValue(Boolean.TRUE);
                fgb.a3(tgjVar);
            }
            return Unit.a;
        }
    }

    public static final class g implements Function2<String, j58, Unit> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            tgj tgjVar = tgj.this;
            if (!((Boolean) ((x5a0) tgjVar.d1).getValue()).booleanValue()) {
                ((x5a0) tgjVar.c1().H).setValue(str2);
                ((x5a0) tgjVar.c1().K).setValue(j58Var2);
                ((x5a0) tgjVar.c1().L).setValue(new j58(j58.f));
                ((x5a0) tgjVar.c1().Q).setValue(2000);
                ((x5a0) tgjVar.c1().O).setValue(Boolean.TRUE);
                fgb.a3(tgjVar);
            }
            return Unit.a;
        }
    }

    public static final class h implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ tgj b;

        public h(View view, tgj tgjVar) {
            this.a = view;
            this.b = tgjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((x5a0) this.b.z2).setValue(Integer.valueOf(this.a.getHeight()));
        }
    }

    public static final void r3(SnapshotStateList snapshotStateList, v5b v5bVar, tgj tgjVar, int i, List list) {
        a aVar = a.a;
        int iIntValue = ((Number) CollectionsKt.k0(list, lx30.INSTANCE)).intValue();
        c cVarA = c.a((c) snapshotStateList.get(i), iIntValue, 0.0f, 1.0f, 0.1f);
        snapshotStateList.set(i, cVarA);
        ej5.c(v5bVar, null, null, new wgj(tgjVar, snapshotStateList, i, cVarA, iIntValue, list, v5bVar, null), 3);
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("GALAXY_GO_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("GALAXY_GO_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_galaxy_go);
            string.getClass();
            progressMeterComponent.setSoundManager("Galaxy_Go/", string, boolValueOf, boolValueOf2, rk60.b.C, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
    }

    @Override // defpackage.fgb
    public final void D2(Coefficients coefficients) {
        long j;
        long j2;
        coefficients.getClass();
        if (((Boolean) ((x5a0) Y0().i).getValue()).booleanValue()) {
            coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            double houseCoefficient = coefficients.getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j = new ubj().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new ubj().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new ubj().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new ubj().o1 : new ubj().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        if (houseCoefficient2 <= 1.5d) {
            j2 = new ubj().l1;
        } else if (houseCoefficient2 <= 4.9d) {
            j2 = new ubj().m1;
        } else if (houseCoefficient2 <= 9.9d) {
            j2 = new ubj().n1;
        } else {
            j2 = houseCoefficient2 <= 18.9d ? new ubj().o1 : new ubj().p1;
        }
        coefficients.m97setCoeffColor8_81llA(j2);
        coefficients.setNew(true);
        Y0().y1(coefficients);
        Y0().x1(coefficients);
    }

    @Override // defpackage.fgb
    public final void E0() {
        ((x5a0) this.y2).setValue(Boolean.TRUE);
    }

    @Override // defpackage.fgb
    public final void E2(PreviousMultiplierResponse previousMultiplierResponse) {
        long j;
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i = 0; i < size; i++) {
            previousMultiplierResponse.getCoefficients().get(i).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i);
            double houseCoefficient = previousMultiplierResponse.getCoefficients().get(i).getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j = new ubj().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new ubj().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new ubj().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new ubj().o1 : new ubj().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
        }
        Y0().B1(previousMultiplierResponse);
    }

    @Override // defpackage.fgb
    public final void J0() {
        ((x5a0) this.y2).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fgb
    public final boolean Q0() {
        return true;
    }

    @Override // defpackage.fgb
    public final void a2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.cashout_sound);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void b2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.fly_away);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void c2() {
        gvi gviVar;
        Boolean bool = (Boolean) ((x5a0) c1().t0).getValue();
        bool.getClass();
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.galaxy_go_id);
        string.getClass();
        rk60.b bVar = rk60.b.C;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.J("galaxy-go", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
    }

    @Override // defpackage.fgb
    public final void d2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.place_bet);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void e2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.powering_up_beep);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void f2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.galaxy_go_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.C;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("galaxy-go", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.galaxy_go_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.C;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_christmas);
        string2.getClass();
        progressMeterComponent.J("galaxy-go", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    public final void n3(final BlurView blurView, final ViewGroup viewGroup, float f2, androidx.compose.runtime.a aVar, final int i) {
        final float f3;
        eg4 a850Var;
        Context context;
        androidx.compose.runtime.b bVarI = aVar.i(1915538511);
        int i2 = (bVarI.A(blurView) ? 4 : 2) | i | (bVarI.A(viewGroup) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 31) {
                a850Var = new o750();
            } else {
                a850Var = (viewGroup == null || (context = viewGroup.getContext()) == null) ? null : new a850(context);
            }
            if (viewGroup != null) {
                ha20 ha20VarB = blurView.b(viewGroup, a850Var);
                ha20VarB.a = 10.0f;
                ha20VarB.e(true);
                long j = j58.l;
                ha20VarB.b(r58.l(j));
                ha20VarB.l = new ColorDrawable(r58.l(j));
            }
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            f3 = 10.0f;
        } else {
            bVarI.G();
            f3 = f2;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(blurView, viewGroup, f3, i) { // from class: dgj
                public final /* synthetic */ BlurView b;
                public final /* synthetic */ ViewGroup c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.n3(this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void o3(final androidx.compose.ui.d dVar, final Object obj, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1715248640);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        d0b.a.b bVar = d0b.a.g;
        if (i3 == 0) {
            i2 |= bVarI.M(bVar) ? 32 : 16;
        }
        int i4 = i & 384;
        n54 n54Var = ht.a.h;
        if (i4 == 0) {
            i2 |= bVarI.M(n54Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || StringsKt.U(str)) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: vfj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.o3(dVar, obj, z, (a) obj2, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            } else {
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                nan.a aVar3 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                aVar3.c = z ? (String) obj : null;
                abn.a(aVar3, false);
                nan nanVarA = aVar3.a();
                crz crzVarA = erz.a(R.drawable.main_bg_gg, 0, bVarI);
                crz crzVarA2 = erz.a(R.drawable.main_bg_gg, 0, bVarI);
                Object objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new wfj();
                    bVarI.r(objY);
                }
                fn80.a(nanVarA, "BG1", s3w.a(androidx.compose.foundation.layout.d.a.b(j.g(j.c(androidx.compose.ui.graphics.a.a(androidx.compose.ui.d.a.b, (Function1) objY), 1.0f), 1.0f), n54Var), "galaxygo_mainbg"), bVar, null, 0.0f, crzVarA, crzVarA2, null, bVarI, ((i2 << 6) & 7168) | 48, 1648);
                bVarI.X(true);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: xfj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.o3(dVar, obj, z, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((x5a0) c1().i0).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.t0) {
            return;
        }
        ((x5a0) c1().a0).setValue(Boolean.FALSE);
        ((x5a0) c1().Y).setValue(Boolean.TRUE);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName("galaxy_go");
        op5.a.getClass();
        op5.c = "sg_galaxy_go";
        SportyGamesManager.getInstance().setScreenName("sportygames/galaxy-go");
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = m.b("galaxy-go");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_galaxy_go", "games/galaxy-go/v1/game");
        goj gojVarC2 = c1();
        osw oswVarA = k.a(R.string.galaxy_go_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = m.b("GALAXY GO");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = m.b("galaxy-go");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = m.b("Galaxy Go");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.gg_toggle_on_color;
        c1().G = R.color.gg_toggle_off_color;
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"GALAXY_GO_MUSIC", "GALAXY_GO_SOUND", "GALAXY_GO_ONE_TAP", "GALAXY_GO_THEME"});
        }
        SharedPreferences sharedPreferences = this.H;
        int i = 0;
        if (sharedPreferences != null) {
            c1().F1(sharedPreferences.getBoolean(((String[]) ((x5a0) c1().B).getValue())[0], true));
        }
        SharedPreferences sharedPreferences2 = this.H;
        if (sharedPreferences2 != null) {
            c1().H1(sharedPreferences2.getBoolean(((String[]) ((x5a0) c1().B).getValue())[1], true));
        }
        SharedPreferences sharedPreferences3 = this.H;
        if (sharedPreferences3 != null) {
            c1().G1(sharedPreferences3.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false));
        }
        goj gojVarC6 = c1();
        ytw<String[]> ytwVarB5 = m.b(getResources().getStringArray(R.array.galaxy_go_array));
        gojVarC6.getClass();
        gojVarC6.A = ytwVarB5;
        gvi gviVar = this.z;
        if (gviVar != null) {
            ComposeView composeView = gviVar.v0;
            qry.a(view, new h(view, this));
            composeView.setContent(new op8(-1271817267, new Function2() { // from class: oej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        tgj tgjVar = this.a;
                        gvi gviVar2 = tgjVar.z;
                        if (gviVar2 != null) {
                            gviVar2.v0.setVisibility(0);
                        }
                        tgjVar.s3(0, aVar);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.I.setContent(new op8(-1912903410, new zej(this, 0), true));
        }
        gvi gviVar3 = this.z;
        ViewGroup.LayoutParams layoutParams = gviVar3 != null ? gviVar3.U.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 1.0f;
        layoutParams2.i = 0;
        layoutParams2.j = -1;
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.U.setLayoutParams(layoutParams2);
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.U.setContent(new op8(1099891600, new Function2() { // from class: ifj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        tgj tgjVar = this.a;
                        if (Intrinsics.g(((MultiplierResponse) ((x5a0) tgjVar.R0().b).getValue()).getMessageType(), "ROUND_ONGOING")) {
                            aVar.N(565333536);
                            d dVarE = j.e(d.a.b, 1.0f);
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = new l66(1);
                                aVar.r(objY);
                            }
                            d dVarA = androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY);
                            Object objY2 = aVar.y();
                            if (objY2 == c0042a) {
                                objY2 = new sgj();
                                aVar.r(objY2);
                            }
                            d dVarC = androidx.compose.ui.draw.a.c(dVarA, (Function1) objY2);
                            aiv aivVarC = g75.c(ht.a.a, false);
                            int iHashCode = Long.hashCode(aVar.m());
                            ne00 ne00VarO = aVar.o();
                            d dVarC2 = c.c(aVar, dVarC);
                            yka.k.getClass();
                            tsr.a aVar2 = yka.a.b;
                            if (aVar.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar.D();
                            if (aVar.g()) {
                                aVar.F(aVar2);
                            } else {
                                aVar.p();
                            }
                            hlh0.a(aVar, aivVarC, yka.a.f);
                            hlh0.a(aVar, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar, iHashCode, c1350a);
                            }
                            hlh0.a(aVar, dVarC2, yka.a.d);
                            tgjVar.v3(0, aVar);
                            aVar.s();
                        } else {
                            aVar.N(556490290);
                        }
                        aVar.H();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar6 = this.z;
        ViewGroup.LayoutParams layoutParams3 = gviVar6 != null ? gviVar6.W.getLayoutParams() : null;
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.S = 0.75f;
        layoutParams4.i = 0;
        layoutParams4.j = -1;
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            gviVar7.W.setLayoutParams(layoutParams4);
        }
        gvi gviVar8 = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar8 != null) {
            ComposeView composeView2 = gviVar8.W;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(-182280686, new Function2() { // from class: qfj
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar2 = d.a.b;
                        d dVarG = j.g(aVar2, 1.0f);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarG);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar3);
                        } else {
                            aVar.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar, dVarC, cVar2);
                        tgj tgjVar = this.a;
                        if (((Boolean) ((x5a0) tgjVar.i0).getValue()).booleanValue()) {
                            aVar.N(656280291);
                            tgjVar.u3(tgjVar.U0(), tgjVar.c1().j0, aVar, 0);
                            Integer num = (Integer) ((x5a0) tgjVar.z2).getValue();
                            if (num == null) {
                                aVar.N(656567908);
                            } else {
                                aVar.N(656567909);
                                float fA = fw20.a(R.dimen._9sdp, aVar);
                                d dVarC2 = g.c(aVar2, fA, lla.b(num.intValue() * 0.103f, aVar) + fA);
                                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                                n54 n54Var = ht.a.a;
                                d dVarB = dVar2.b(dVarC2, n54Var);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode2 = Long.hashCode(aVar.m());
                                ne00 ne00VarO2 = aVar.o();
                                d dVarC3 = c.c(aVar, dVarB);
                                if (aVar.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar.D();
                                if (aVar.g()) {
                                    aVar.F(aVar3);
                                } else {
                                    aVar.p();
                                }
                                hlh0.a(aVar, aivVarC2, bVar);
                                hlh0.a(aVar, ne00VarO2, dVar);
                                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar, dVarC3, cVar2);
                                goj gojVarC7 = tgjVar.c1();
                                boolean zA = aVar.A(tgjVar);
                                Object objY = aVar.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new tfj(tgjVar, 0);
                                    aVar.r(objY);
                                }
                                hv30.a(gojVarC7, (Function0) objY, false, aVar, 0, 4);
                                aVar.s();
                            }
                            aVar.H();
                        } else {
                            aVar.N(645622646);
                        }
                        aVar.H();
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar9 = this.z;
        ViewGroup.LayoutParams layoutParams5 = gviVar9 != null ? gviVar9.V.getLayoutParams() : null;
        layoutParams5.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.S = 1.0f;
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            gviVar10.V.setLayoutParams(layoutParams6);
        }
        bgj bgjVar = new bgj(this, i);
        jgj jgjVar = new jgj(this, i);
        this.J1 = bgjVar;
        this.K1 = jgjVar;
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            final ComposeView composeView3 = gviVar11.i;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(-1336243231, new Function2() { // from class: qgj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 0;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final tgj tgjVar = this.a;
                        final BetContainerState betContainerState = (BetContainerState) wyh.c(tgjVar.R0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(tgjVar.S0().a, aVar, 0, 7).getValue();
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarB);
                        yka.k.getClass();
                        tsr.a aVar2 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar2);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) tgjVar.R0().d).getValue()).get(Long.valueOf(betContainerState.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = tgjVar.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) tgjVar.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) tgjVar.c1().e0).getValue(), (cj5) ((x5a0) tgjVar.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) tgjVar.z2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) tgjVar.R0().b).getValue();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) tgjVar.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) tgjVar.y2).getValue()).booleanValue();
                        int i3 = iIntValue2;
                        boolean resetChips = betContainerState.getResetChips();
                        t290 t290VarJ1 = tgjVar.j1();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) tgjVar.c1().v).getValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        l1z l1zVarE1 = tgjVar.e1();
                        osw oswVar = tgjVar.R0().M;
                        boolean zA = aVar.A(tgjVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new qej(tgjVar, i2);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(tgjVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new vej(tgjVar, i2);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(tgjVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new wej(tgjVar, 0);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(tgjVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new xej(tgjVar, 0);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(tgjVar);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new yej(tgjVar, 0);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(tgjVar) | aVar.A(betContainerState);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: afj
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                    tgj tgjVar2 = tgjVar;
                                    tgjVar2.S0().S1(true);
                                    ytw<Boolean> ytwVar2 = tgjVar2.j1;
                                    Boolean bool2 = Boolean.FALSE;
                                    x5a0 x5a0Var = (x5a0) ytwVar2;
                                    x5a0Var.setValue(bool2);
                                    BetContainerState betContainerState3 = betContainerState;
                                    if (zBooleanValue5) {
                                        tgjVar2.p1 = 1;
                                        tgjVar2.R0().P1(1);
                                        tgjVar2.R0().Q1(-1);
                                        Boolean bool3 = Boolean.TRUE;
                                        x5a0Var.setValue(bool3);
                                        ((u5a0) tgjVar2.n1).k(15);
                                        tgjVar2.R0().M1(!betContainerState3.getExtraKey());
                                        tgjVar2.R0().R1(true);
                                        tgjVar2.R0().S1(false);
                                        ((x5a0) tgjVar2.R0().c).setValue(bool3);
                                    } else {
                                        x5a0Var.setValue(bool2);
                                        tgjVar2.R0().R1(false);
                                        tgjVar2.R0().Q1(-1);
                                        tgjVar2.R0().M1(!betContainerState3.getExtraKey());
                                        ((x5a0) tgjVar2.R0().c).setValue(bool2);
                                    }
                                    tgjVar2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(tgjVar) | aVar.A(betContainerState);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new bfj(tgjVar, betContainerState);
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(tgjVar);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new cfj(tgjVar, 0);
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(tgjVar);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new dfj(tgjVar, 0);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(tgjVar);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = tgjVar.new f();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(tgjVar);
                        final ComposeView composeView4 = composeView3;
                        boolean zA12 = zA11 | aVar.A(composeView4);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: efj
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    tgj tgjVar2 = tgjVar;
                                    ((x5a0) tgjVar2.c1().J).setValue(betData);
                                    ((BetContainerState) tgjVar2.R0().a.getValue()).setBetData(betData);
                                    ((x5a0) tgjVar2.c1().T).setValue(Boolean.TRUE);
                                    ytw<String> ytwVar2 = tgjVar2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView5 = composeView4;
                                    String strB = w68.b(composeView5, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView5.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) tgjVar2.c1().R).setValue(f78.a(composeView5, R.string.yes_bet, w68.b(composeView5, R.string.yes_btn_cms), null));
                                    ((x5a0) tgjVar2.c1().S).setValue(f78.a(composeView5, R.string.cancel_bet, w68.b(composeView5, R.string.cancel_btn_cms), null));
                                    tgjVar2.H1();
                                    tgjVar2.c1().E1(tgjVar2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(tgjVar);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new rej(tgjVar, 0);
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(tgjVar);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new sej(tgjVar, 0);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(tgjVar);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new tej(tgjVar, 0);
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(tgjVar);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new Function1() { // from class: uej
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    tgj tgjVar2 = tgjVar;
                                    tgjVar2.e3(tgjVar2.R0(), betData);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY15);
                        }
                        x2a.a(i3, sl2Var, betContainerState, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            final ComposeView composeView4 = gviVar12.e;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(-1977329374, new Function2() { // from class: rgj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 1;
                    int i3 = 0;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final tgj tgjVar = this.a;
                        BetContainerState betContainerState = (BetContainerState) wyh.c(tgjVar.R0().a, aVar, 0, 7).getValue();
                        final BetContainerState betContainerState2 = (BetContainerState) wyh.c(tgjVar.S0().a, aVar, 0, 7).getValue();
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarB);
                        yka.k.getClass();
                        tsr.a aVar2 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar2);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) tgjVar.S0().d).getValue()).get(Long.valueOf(betContainerState2.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = tgjVar.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) tgjVar.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) tgjVar.c1().e0).getValue(), (cj5) ((x5a0) tgjVar.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) tgjVar.z2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) tgjVar.S0().b).getValue();
                        t290 t290VarJ1 = tgjVar.j1();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) tgjVar.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) tgjVar.y2).getValue()).booleanValue();
                        int i4 = iIntValue2;
                        boolean resetChips = betContainerState2.getResetChips();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) tgjVar.c1().v).getValue();
                        boolean z = egb.a(betContainerState) > 0;
                        l1z l1zVarE1 = tgjVar.e1();
                        osw oswVar = tgjVar.S0().M;
                        boolean zA = aVar.A(tgjVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new ffj(tgjVar, i3);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(tgjVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new tba(tgjVar, i2);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(tgjVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new o46(tgjVar, 1);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(tgjVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new jfj(tgjVar, 0);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(tgjVar);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new kfj(tgjVar, 0);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(tgjVar) | aVar.A(betContainerState2);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new r46(tgjVar, betContainerState2, 1);
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(tgjVar) | aVar.A(betContainerState2);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: lfj
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    tgj tgjVar2 = tgjVar;
                                    ((x5a0) tgjVar2.c1().J).setValue(betData);
                                    int i5 = 0;
                                    int i6 = 1;
                                    if (zBooleanValue5) {
                                        tgjVar2.S0().G1(true);
                                        if (!betContainerState2.getBetPlaced()) {
                                            if (tgjVar2.j0) {
                                                ((BetContainerState) tgjVar2.S0().a.getValue()).setBetData(betData);
                                                goj.A1(tgjVar2.c1(), betData, tgjVar2.z0, tgjVar2.U0, tgjVar2.h2, 1, "MANUAL", new cgj(tgjVar2, i5), new o56(tgjVar2, i6), null, null, null, 1792);
                                            } else {
                                                tgjVar2.p0(tgjVar2.S0(), betData, null);
                                            }
                                        }
                                    } else {
                                        tgjVar2.S0().G1(false);
                                    }
                                    tgjVar2.R0().S1(true);
                                    tgjVar2.R0().P1(0);
                                    ((x5a0) tgjVar2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(tgjVar);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new mfj(tgjVar, 0);
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(tgjVar);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new nfj(tgjVar, 0);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(tgjVar);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = tgjVar.new g();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(tgjVar);
                        final ComposeView composeView5 = composeView4;
                        boolean zA12 = zA11 | aVar.A(composeView5);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: ofj
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    tgj tgjVar2 = tgjVar;
                                    ((x5a0) tgjVar2.c1().T).setValue(Boolean.TRUE);
                                    ((x5a0) tgjVar2.c1().J).setValue(betData);
                                    ((BetContainerState) tgjVar2.S0().a.getValue()).setBetData(betData);
                                    ytw<String> ytwVar2 = tgjVar2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView6 = composeView5;
                                    String strB = w68.b(composeView6, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView6.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) tgjVar2.c1().R).setValue(f78.a(composeView6, R.string.yes_bet, w68.b(composeView6, R.string.yes_btn_cms), null));
                                    ((x5a0) tgjVar2.c1().S).setValue(f78.a(composeView6, R.string.cancel_bet, w68.b(composeView6, R.string.cancel_btn_cms), null));
                                    tgjVar2.H1();
                                    tgjVar2.c1().E1(tgjVar2.S0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(tgjVar);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new gfj(tgjVar, 0);
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(tgjVar);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new j46(tgjVar, 1);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(tgjVar);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new hfj(tgjVar, 0);
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(tgjVar);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new rba(tgjVar, 1);
                            aVar.r(objY15);
                        }
                        x2a.a(i4, sl2Var, betContainerState2, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0232  */
    /* JADX WARN: Code duplicated, block: B:60:0x0236  */
    /* JADX WARN: Code duplicated, block: B:65:0x0251  */
    /* JADX WARN: Code duplicated, block: B:68:0x0276  */
    /* JADX WARN: Code duplicated, block: B:69:0x027a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0295  */
    /* JADX WARN: Code duplicated, block: B:77:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0326  */
    /* JADX WARN: Code duplicated, block: B:83:0x032a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0349  */
    /* JADX WARN: Code duplicated, block: B:93:0x0381  */
    /* JADX WARN: Code duplicated, block: B:94:0x0385  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void p3(cj5 cj5Var, ytw<Boolean> ytwVar, androidx.compose.runtime.a aVar, final int i) {
        final cj5 cj5Var2;
        final ytw<Boolean> ytwVar2;
        Object bVar;
        float f2;
        wd0 wd0Var;
        wd0 wd0Var2;
        int i2;
        androidx.compose.runtime.b bVar2;
        tsr.a aVar2;
        chf chfVar;
        boolean z;
        int iHashCode;
        int iHashCode2;
        tsr.a aVar3;
        float f3;
        float f4;
        int iHashCode3;
        int iHashCode4;
        ytwVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2120346126);
        int i3 = i | (bVarI.A(cj5Var) ? 4 : 2) | (bVarI.M(ytwVar) ? 32 : 16) | (bVarI.A(this) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            String messageType = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getMessageType();
            String currentMultiplier = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getCurrentMultiplier();
            int millisLeft = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getMillisLeft();
            int totalMillis = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getTotalMillis();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var3 = (wd0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar3 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var4 = (wd0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(0.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var5 = (wd0) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar4 = (ytw) objY5;
            boolean zM = bVarI.M(messageType) | bVarI.A(wd0Var3) | bVarI.A(wd0Var5) | bVarI.A(wd0Var4);
            Object objY6 = bVarI.y();
            if (zM || objY6 == c0042a) {
                f2 = 1.0f;
                bVar = new b(messageType, wd0Var3, wd0Var5, wd0Var4, ytwVar3, ytwVar4, null);
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var5;
                bVarI.r(bVar);
            } else {
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var5;
                f2 = 1.0f;
                bVar = objY6;
            }
            xvf.e(bVarI, messageType, (Function2) bVar);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            chf chfVar2 = AndroidCompositionLocals_androidKt.a;
            float f5 = ((Configuration) bVarI.O(chfVar2)).screenHeightDp;
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar4, f2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i2 = i3;
            } else {
                i2 = i3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (Intrinsics.g(messageType, "ROUND_ONGOING")) {
                    bVarI.N(1706550120);
                    androidx.compose.ui.d dVarE2 = j.e(aVar4, 1.0f);
                    op8 op8VarB = pp8.b(1912912411, new ngj(0, mmdVar, this), bVarI);
                    bVar2 = bVarI;
                    z = false;
                    chfVar = chfVar2;
                    aVar2 = aVar5;
                    q75.a(dVarE2, null, false, op8VarB, bVar2, 3078, 6);
                } else {
                    bVar2 = bVarI;
                    aVar2 = aVar5;
                    chfVar = chfVar2;
                    z = false;
                    bVar2.N(1645761910);
                }
                bVar2.X(z);
                bVar2.X(true);
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.h.j(j.e(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, f5 / 5.8f, 7);
                n54 n54Var = ht.a.h;
                aiv aivVarC2 = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVar2.T);
                ne00 ne00VarS2 = bVar2.S();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVar2, dVarJ);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar2);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, aivVarC2, bVar3);
                hlh0.a(bVar2, ne00VarS2, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar2, iHashCode, c1350a);
                }
                hlh0.a(bVar2, dVarC2, cVar);
                i78 i78VarA = g78.a(kw0.e, ht.a.n, bVar2, 54);
                iHashCode2 = Long.hashCode(bVar2.T);
                ne00 ne00VarS3 = bVar2.S();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVar2, aVar4);
                bVar2.D();
                if (bVar2.S) {
                    bVar2.F(aVar2);
                } else {
                    bVar2.p();
                }
                hlh0.a(bVar2, i78VarA, bVar3);
                hlh0.a(bVar2, ne00VarS3, dVar);
                if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
                }
                hlh0.a(bVar2, dVarC3, cVar);
                bVarI = bVar2;
                aVar3 = aVar2;
                qpw.c(messageType, currentMultiplier, millisLeft, totalMillis, cj5Var, ytwVar, ((Boolean) ((x5a0) this.l1).getValue()).booleanValue(), bVarI, (i2 << 12) & 516096);
                cj5Var2 = cj5Var;
                f3 = ((Configuration) bVarI.O(chfVar)).screenHeightDp;
                f4 = 0.05f * f3;
                if (messageType.equals("ROUND_WAITING")) {
                    hnw.a(bVarI, 1295636520, aVar4, f4, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(1295734604);
                    ty0.a(bVarI, j.i(aVar4, f3 * 0.01f));
                    bVarI.X(false);
                }
                androidx.compose.ui.d dVarG = j.g(aVar4, 1.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar3);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                f160 f160Var = f160.a;
                g75.a(f160Var.a(0.15f, aVar4, true), bVarI, 0);
                androidx.compose.ui.d dVarA = f160Var.a(0.7f, aVar4, true);
                aiv aivVarC3 = g75.c(n54Var, false);
                iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarA);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar3);
                hlh0.a(bVarI, ne00VarS5, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                ytwVar2 = ytwVar;
                qpw.b(messageType, ((Boolean) ytwVar3.getValue()).booleanValue(), ((Number) wd0Var4.d()).floatValue(), ((Number) wd0Var2.d()).floatValue(), ((Boolean) ytwVar4.getValue()).booleanValue(), ((Number) wd0Var.d()).floatValue(), bVarI, 0);
                bVarI.X(true);
                r9o.a(f160Var.a(0.15f, aVar4, true), bVarI, 0, true, true);
                bVarI.X(true);
            }
            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (Intrinsics.g(messageType, "ROUND_ONGOING")) {
                bVarI.N(1706550120);
                androidx.compose.ui.d dVarE3 = j.e(aVar4, 1.0f);
                op8 op8VarB2 = pp8.b(1912912411, new ngj(0, mmdVar, this), bVarI);
                bVar2 = bVarI;
                z = false;
                chfVar = chfVar2;
                aVar2 = aVar5;
                q75.a(dVarE3, null, false, op8VarB2, bVar2, 3078, 6);
            } else {
                bVar2 = bVarI;
                aVar2 = aVar5;
                chfVar = chfVar2;
                z = false;
                bVar2.N(1645761910);
            }
            bVar2.X(z);
            bVar2.X(true);
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.h.j(j.e(aVar4, 1.0f), 0.0f, 0.0f, 0.0f, f5 / 5.8f, 7);
            n54 n54Var2 = ht.a.h;
            aiv aivVarC4 = g75.c(n54Var2, false);
            iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS6 = bVar2.S();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(bVar2, dVarJ2);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar2);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC4, bVar3);
            hlh0.a(bVar2, ne00VarS6, dVar);
            if (bVar2.S) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            hlh0.a(bVar2, dVarC6, cVar2);
            i78 i78VarA2 = g78.a(kw0.e, ht.a.n, bVar2, 54);
            iHashCode2 = Long.hashCode(bVar2.T);
            ne00 ne00VarS7 = bVar2.S();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(bVar2, aVar4);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar2);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, i78VarA2, bVar3);
            hlh0.a(bVar2, ne00VarS7, dVar);
            if (bVar2.S) {
                n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVar2, iHashCode2, c1350a);
            }
            hlh0.a(bVar2, dVarC7, cVar2);
            bVarI = bVar2;
            aVar3 = aVar2;
            qpw.c(messageType, currentMultiplier, millisLeft, totalMillis, cj5Var, ytwVar, ((Boolean) ((x5a0) this.l1).getValue()).booleanValue(), bVarI, (i2 << 12) & 516096);
            cj5Var2 = cj5Var;
            f3 = ((Configuration) bVarI.O(chfVar)).screenHeightDp;
            f4 = 0.05f * f3;
            if (messageType.equals("ROUND_WAITING")) {
                hnw.a(bVarI, 1295636520, aVar4, f4, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(1295734604);
                ty0.a(bVarI, j.i(aVar4, f3 * 0.01f));
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarG2 = j.g(aVar4, 1.0f);
            d160 d160VarA2 = b160.a(kw0.a, ht.a.j, bVarI, 0);
            iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS8 = bVarI.S();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS8, dVar);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC8, cVar2);
            f160 f160Var2 = f160.a;
            g75.a(f160Var2.a(0.15f, aVar4, true), bVarI, 0);
            androidx.compose.ui.d dVarA2 = f160Var2.a(0.7f, aVar4, true);
            aiv aivVarC5 = g75.c(n54Var2, false);
            iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS9 = bVarI.S();
            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar3);
            hlh0.a(bVarI, ne00VarS9, dVar);
            if (bVarI.S) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC9, cVar2);
            ytwVar2 = ytwVar;
            qpw.b(messageType, ((Boolean) ytwVar3.getValue()).booleanValue(), ((Number) wd0Var4.d()).floatValue(), ((Number) wd0Var2.d()).floatValue(), ((Boolean) ytwVar4.getValue()).booleanValue(), ((Number) wd0Var.d()).floatValue(), bVarI, 0);
            bVarI.X(true);
            r9o.a(f160Var2.a(0.15f, aVar4, true), bVarI, 0, true, true);
            bVarI.X(true);
        } else {
            cj5Var2 = cj5Var;
            ytwVar2 = ytwVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(cj5Var2, ytwVar2, i) { // from class: ogj
                public final /* synthetic */ cj5 b;
                public final /* synthetic */ ytw c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.p3(this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q3(final long j, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        Object ugjVar;
        SnapshotStateList snapshotStateList;
        androidx.compose.ui.d.a aVar2;
        boolean z;
        androidx.compose.runtime.b bVar2;
        a aVar3 = a.a;
        androidx.compose.runtime.b bVarI = aVar.i(-1264270740);
        int i2 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.A(this) ? 256 : 128);
        boolean z2 = false;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateList();
                bVarI.r(objY);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new SnapshotStateList();
                bVarI.r(objY2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY3);
            }
            v5b v5bVar = (v5b) objY3;
            op5 op5Var = op5.a;
            List listK = kotlin.collections.b.k(op5.c(op5Var, "planet1_png:sg_game_name", ""), op5.c(op5Var, "planet2_png:sg_game_name", ""), op5.c(op5Var, "planet3_png:sg_game_name", ""), op5.c(op5Var, "planet4_png:sg_game_name", ""), op5.c(op5Var, "planet5_png:sg_game_name", ""), op5.c(op5Var, "planet6_png:sg_game_name", ""), op5.c(op5Var, "planet7_png:sg_game_name", ""), op5.c(op5Var, "planet8_png:sg_game_name", ""), op5.c(op5Var, "planet9_png:sg_game_name", ""));
            Unit unit = Unit.a;
            boolean zM = ((i2 & 14) == 4) | bVarI.M(listK);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                snapshotStateList = snapshotStateList2;
                ugjVar = new ugj(snapshotStateList, listK, snapshotStateList3, j, null);
                bVarI.r(ugjVar);
            } else {
                ugjVar = objY4;
                snapshotStateList = snapshotStateList2;
            }
            xvf.e(bVarI, unit, (Function2) ugjVar);
            boolean zA = bVarI.A(v5bVar) | bVarI.A(this);
            Object objY5 = bVarI.y();
            Throwable th = null;
            if (zA || objY5 == c0042a) {
                objY5 = new vgj(snapshotStateList, v5bVar, this, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, aVar3, (Function2) objY5);
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar4, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(200730294);
            ListIterator listIterator = snapshotStateList.listIterator();
            int i3 = 0;
            while (true) {
                dxd0 dxd0Var = (dxd0) listIterator;
                if (!dxd0Var.hasNext()) {
                    bVar = bVarI;
                    bVar.X(z2);
                    bVar.X(true);
                    break;
                }
                Object next = dxd0Var.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    kotlin.collections.b.q();
                    throw th2;
                }
                c cVar = (c) next;
                int i5 = cVar.b;
                float f2 = cVar.c;
                Pair pair = (Pair) CollectionsKt.V(i5, snapshotStateList3);
                if (pair == null) {
                    bVar2 = bVarI;
                    z = z2;
                    aVar2 = aVar4;
                } else {
                    B b2 = pair.b;
                    gly glyVar = (gly) pair.a;
                    gly glyVar2 = (gly) b2;
                    androidx.compose.ui.d.a aVar6 = aVar4;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (glyVar2.a & 4294967295L)) - Float.intBitsToFloat((int) (glyVar.a & 4294967295L))) * f2) + Float.intBitsToFloat((int) (glyVar.a & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (glyVar2.a >> 32)) - Float.intBitsToFloat((int) (glyVar.a >> 32))) * f2) + Float.intBitsToFloat((int) (glyVar.a >> 32)))) << 32);
                    nan.a aVar7 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                    aVar7.c = cVar.a;
                    abn.a(aVar7, false);
                    nan nanVarA = aVar7.a();
                    androidx.compose.runtime.b bVar3 = bVarI;
                    String strB = pe4.b(i3, "gg_planet", "_visibility");
                    float f3 = cVar.e;
                    aVar2 = aVar6;
                    z = false;
                    fn80.a(nanVarA, strB, s3w.a(j.r(androidx.compose.ui.graphics.a.c(aVar6, f3, f3, cVar.d, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), 0.0f, 0L, null, 524256), 40.0f), "gg_planet" + i3 + "_visibility"), d0b.a.b, null, 0.0f, null, null, null, bVar3, 3072, 2032);
                    bVar2 = bVar3;
                }
                bVarI = bVar2;
                z2 = z;
                aVar4 = aVar2;
                th = th;
                i3 = i4;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(this, j, i) { // from class: pgj
                public final /* synthetic */ tgj a;
                public final /* synthetic */ long b;

                {
                    tgj.a aVar8 = tgj.a.a;
                    this.a = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    tgj.a aVar8 = tgj.a.a;
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    this.a.q3(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void s3(final int i, androidx.compose.runtime.a aVar) {
        final tgj tgjVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1174904922);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.ui.d dVarG = j.g(j.c(aVar2, 1.0f), 1.0f);
            op5 op5Var = op5.a;
            tgjVar = this;
            tgjVar.o3(dVarG, op5.c(op5Var, "main_bg_png:sg_game_name", ""), ((Boolean) ((x5a0) c1().g0).getValue()).booleanValue(), bVarI, ((i2 << 15) & 458752) | 438);
            tgjVar.w3(null, op5.c(op5Var, "stars_bg_png:sg_game_name", ""), bVarI, (i2 << 6) & 896);
            bVarI.X(true);
        } else {
            tgjVar = this;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: pej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.s3(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final void t3(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-408734044);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qpw.a(null, op5.c(op5.a, "earth_png:sg_game_name", ""), 0.0f, ((Boolean) ((x5a0) c1().g0).getValue()).booleanValue(), bVarI, 0);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            x5a0 x5a0Var = (x5a0) this.i0;
            Object value = x5a0Var.getValue();
            boolean zA = bVarI.A(this);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new d(ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, value, (Function2) objY2);
            gvi gviVar = this.z;
            ComposeView composeView = gviVar != null ? gviVar.M : null;
            if (composeView == null) {
                bVarI.N(-362817991);
            } else {
                bVarI.N(-362817990);
                gvi gviVar2 = this.z;
                if (gviVar2 != null) {
                    gviVar2.N.setVisibility(0);
                }
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    bVarI.N(1309973171);
                    try {
                        gvi gviVar3 = this.z;
                        ComposeView composeView2 = gviVar3 != null ? gviVar3.M : null;
                        if (composeView2 != null) {
                            composeView2.setVisibility(0);
                        }
                        composeView.setLayerType(2, null);
                        composeView.setContent(pp8.b(263156608, new Function2() { // from class: pfj
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar2 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                        aVar2.N(1383258520);
                                        tgj tgjVar = this.a;
                                        e activity = tgjVar.getActivity();
                                        ViewGroup viewGroup = activity != null ? (ViewGroup) activity.findViewById(R.id.blur_target_container) : null;
                                        d dVarB = androidx.compose.foundation.a.b(ls7.a(j.e(d.a.b, 1.0f), j060.c(16.0f)), j58.l, zk40.a);
                                        aiv aivVarC = g75.c(ht.a.a, false);
                                        int iHashCode = Long.hashCode(aVar2.m());
                                        ne00 ne00VarO = aVar2.o();
                                        d dVarC = c.c(aVar2, dVarB);
                                        yka.k.getClass();
                                        tsr.a aVar3 = yka.a.b;
                                        if (aVar2.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar2.D();
                                        if (aVar2.g()) {
                                            aVar2.F(aVar3);
                                        } else {
                                            aVar2.p();
                                        }
                                        hlh0.a(aVar2, aivVarC, yka.a.f);
                                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                        }
                                        hlh0.a(aVar2, dVarC, yka.a.d);
                                        gvi gviVar4 = tgjVar.z;
                                        BlurView blurView = gviVar4 != null ? gviVar4.v : null;
                                        if (blurView == null) {
                                            aVar2.N(1948028605);
                                        } else {
                                            aVar2.N(1948028606);
                                            gvi gviVar5 = tgjVar.z;
                                            if (gviVar5 != null) {
                                                gviVar5.v.setVisibility(0);
                                            }
                                            gvi gviVar6 = tgjVar.z;
                                            if (gviVar6 != null) {
                                                gviVar6.w.setVisibility(0);
                                            }
                                            tgjVar.n3(blurView, viewGroup, 0.0f, aVar2, 0);
                                        }
                                        aVar2.H();
                                        aVar2.s();
                                    } else {
                                        aVar2.N(1340496066);
                                    }
                                    aVar2.H();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI));
                    } catch (Exception unused) {
                        throw new czx("An operation is not implemented: Not yet implemented");
                    }
                } else {
                    bVarI.N(1267523011);
                }
                bVarI.X(false);
            }
            bVarI.X(false);
            gvi gviVar4 = this.z;
            ComposeView composeView3 = gviVar4 != null ? gviVar4.N : null;
            if (composeView3 == null) {
                bVarI.N(-361397602);
            } else {
                bVarI.N(-361397601);
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    bVarI.N(-1168358079);
                    composeView3.setLayerType(2, null);
                    composeView3.setContent(pp8.b(-1124649353, new rfj(this, ytwVar), bVarI));
                } else {
                    bVarI.N(-1212167124);
                }
                bVarI.X(false);
            }
            bVarI.X(false);
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                ComposeView composeView4 = gviVar5.O;
                if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                    composeView4.setContent(j39.a);
                }
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new sfj(this, i);
        }
    }

    public final void u3(final cj5 cj5Var, final ytw<Boolean> ytwVar, androidx.compose.runtime.a aVar, final int i) {
        ytwVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1810794222);
        int i2 = (bVarI.A(cj5Var) ? 4 : 2) | i | (bVarI.M(ytwVar) ? 32 : 16) | (bVarI.A(this) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            p3(cj5Var, ytwVar, bVarI, i2 & 1022);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(cj5Var, ytwVar, i) { // from class: lgj
                public final /* synthetic */ cj5 b;
                public final /* synthetic */ ytw c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.u3(this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void v3(final int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-839279985);
        int i2 = i & 1;
        if (bVarI.q(i2, i2 != 0)) {
            op5 op5Var = op5.a;
            List listK = kotlin.collections.b.k(op5.c(op5Var, "speedline_1_png:sg_game_name", ""), op5.c(op5Var, "speedline_2_png:sg_game_name", ""), op5.c(op5Var, "speedline_3_png:sg_game_name", ""), op5.c(op5Var, "speedline_4_png:sg_game_name", ""));
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            osw oswVar = (osw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = k.a(1);
                bVarI.r(objY2);
            }
            osw oswVar2 = (osw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(1.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var = (wd0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(0.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var2 = (wd0) objY4;
            Integer numValueOf = Integer.valueOf(oswVar.D());
            boolean zA = bVarI.A(wd0Var2) | bVarI.A(wd0Var) | bVarI.M(listK);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                e eVar = new e(wd0Var2, wd0Var, listK, oswVar2, oswVar, null);
                bVarI.r(eVar);
                objY5 = eVar;
            }
            xvf.e(bVarI, numValueOf, (Function2) objY5);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            nan.a aVar4 = new nan.a((Context) bVarI.O(qyd0Var));
            aVar4.c = listK.get(oswVar.D());
            abn.a(aVar4, false);
            nan nanVarA = aVar4.a();
            String strA = hce0.a(oswVar.D(), "Speedline ");
            androidx.compose.ui.d dVarA = s3w.a(dw.a(j.e(aVar2, 1.0f), ((Number) wd0Var.d()).floatValue()), "gg_speedline" + oswVar.D() + "_visibility");
            d0b.a.C0470a c0470a = d0b.a.a;
            fn80.a(nanVarA, strA, dVarA, c0470a, null, 0.0f, null, null, null, bVarI, 3072, 2032);
            nan.a aVar5 = new nan.a((Context) bVarI.O(qyd0Var));
            aVar5.c = listK.get(oswVar2.D());
            abn.a(aVar5, false);
            fn80.a(aVar5.a(), null, dw.a(j.e(aVar2, 1.0f), ((Number) wd0Var2.d()).floatValue()), c0470a, null, 0.0f, null, null, null, bVarI, 3120, 2032);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: mgj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.v3(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final void w3(androidx.compose.ui.d dVar, final Object obj, androidx.compose.runtime.a aVar, final int i) {
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(1939079544);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(obj) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final egn.a aVarA = kgn.a(kgn.b("StarRotation", bVarI, 0), 0.0f, 360.0f, yi0.a(yi0.e(120000, 0, xkf.d, 2), l850.a, 0L, 4), "StarRotationAnim", bVarI, 29112, 0);
            nan.a aVar2 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            aVar2.c = obj;
            abn.a(aVar2, false);
            nan nanVarA = aVar2.a();
            dVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarA = s3w.a(j.e(dVar2, 1.0f), "galaxygo_stars");
            boolean zM = bVarI.M(aVarA);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: zfj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        a7l a7lVar = (a7l) obj2;
                        a7lVar.getClass();
                        a7lVar.u(((Number) aVarA.getValue()).floatValue());
                        a7lVar.z0(jsg0.b);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            fn80.a(nanVarA, "galaxygo_stars", androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY), d0b.a.a, null, 0.0f, null, null, null, bVarI, 3120, 2032);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: agj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.w3(dVar2, obj, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // defpackage.fgb
    public final void I0() {
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // defpackage.fgb
    public final void h2() {
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }
}
