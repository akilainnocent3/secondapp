package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class z5h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ yp40 a;
    public final /* synthetic */ a6h b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;
    public final /* synthetic */ Bitmap v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ Pair<Float, Float> y;
    public final /* synthetic */ Pair<Integer, Integer> z;

    @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1", f = "FHuntCollisionHelper.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Pair<Integer, Integer> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;
        public final /* synthetic */ int H;
        public int a;
        public final /* synthetic */ yp40 b;
        public final /* synthetic */ a6h c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int i;
        public final /* synthetic */ int v;
        public final /* synthetic */ Bitmap w;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ Pair<Float, Float> z;

        /* JADX INFO: renamed from: z5h$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1", f = "FHuntCollisionHelper.kt", l = {162}, m = "invokeSuspend", v = 1)
        public static final class C1375a extends tje0 implements Function2<v5b, v1b<? super List<? extends Boolean>>, Object> {
            public final /* synthetic */ Pair<Integer, Integer> A;
            public final /* synthetic */ int B;
            public final /* synthetic */ int C;
            public final /* synthetic */ int D;
            public final /* synthetic */ int E;
            public final /* synthetic */ int F;
            public final /* synthetic */ int G;
            public final /* synthetic */ int H;
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a6h c;
            public final /* synthetic */ Rect d;
            public final /* synthetic */ int e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int i;
            public final /* synthetic */ int v;
            public final /* synthetic */ Bitmap w;
            public final /* synthetic */ boolean y;
            public final /* synthetic */ Pair<Float, Float> z;

            /* JADX INFO: renamed from: z5h$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$10", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C1376a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1376a(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super C1376a> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1376a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((C1376a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(false, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$b */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$11", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(false, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$c */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$12", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class c extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super c> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$d */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$1", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class d extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super d> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new d(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$e */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$2", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class e extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super e> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$f */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$3", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class f extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super f> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$g */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$4", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class g extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super g> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(false, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$h */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$5", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class h extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super h> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(false, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$i */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$6", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class i extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super i> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$j */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$7", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class j extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super j> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new j(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$k */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$8", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class k extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super k> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX INFO: renamed from: z5h$a$a$l */
            @c0d(c = "com.sportygames.fruithunt.views.collisions.FHuntCollisionHelper$breakCheck$1$1$result$1$9", f = "FHuntCollisionHelper.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class l extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
                public final /* synthetic */ a6h a;
                public final /* synthetic */ Rect b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Bitmap i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Pair<Float, Float> w;
                public final /* synthetic */ Pair<Integer, Integer> y;
                public final /* synthetic */ int z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l(a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, v1b<? super l> v1bVar) {
                    super(2, v1bVar);
                    this.a = a6hVar;
                    this.b = rect;
                    this.c = i;
                    this.d = i2;
                    this.e = i3;
                    this.f = i4;
                    this.i = bitmap;
                    this.v = z;
                    this.w = pair;
                    this.y = pair2;
                    this.z = i5;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new l(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
                    return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    return Boolean.valueOf(this.a.b(true, this.b, new Rect(this.c, this.d, this.e, this.f), this.i, this.v, this.w, this.y, this.z));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1375a(a6h a6hVar, Rect rect, int i2, int i3, int i4, int i5, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i6, int i7, int i8, int i9, int i10, int i11, int i12, v1b<? super C1375a> v1bVar) {
                super(2, v1bVar);
                this.c = a6hVar;
                this.d = rect;
                this.e = i2;
                this.f = i3;
                this.i = i4;
                this.v = i5;
                this.w = bitmap;
                this.y = z;
                this.z = pair;
                this.A = pair2;
                this.B = i6;
                this.C = i7;
                this.D = i8;
                this.E = i9;
                this.F = i10;
                this.G = i11;
                this.H = i12;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1375a c1375a = new C1375a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, v1bVar);
                c1375a.b = obj;
                return c1375a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super List<? extends Boolean>> v1bVar) {
                return ((C1375a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i2 = this.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int i3 = this.B;
                a6h a6hVar = this.c;
                Rect rect = this.d;
                int i4 = this.e;
                int i5 = this.f;
                int i6 = this.i;
                int i7 = this.v;
                Bitmap bitmap = this.w;
                boolean z = this.y;
                Pair<Float, Float> pair = this.z;
                Pair<Integer, Integer> pair2 = this.A;
                ojd[] ojdVarArr = {ej5.a(v5bVar, null, new d(a6hVar, rect, i4, i5, i6, i7, bitmap, z, pair, pair2, i3, null), 3), ej5.a(v5bVar, null, new e(this.c, rect, this.i, this.f, this.C, this.v, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new f(this.c, rect, this.C, this.f, this.D, this.v, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new g(this.c, rect, this.D, this.f, this.E, this.v, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new h(this.c, rect, this.F, this.f, this.G, this.v, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new i(this.c, rect, this.G, this.f, this.e, this.v, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new j(this.c, rect, this.e, this.H, this.i, this.f, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new k(this.c, rect, this.i, this.H, this.C, this.f, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new l(this.c, rect, this.C, this.H, this.D, this.f, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new C1376a(this.c, rect, this.D, this.H, this.E, this.f, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new b(this.c, rect, this.F, this.H, this.G, this.f, this.w, this.y, pair, pair2, this.B, null), 3), ej5.a(v5bVar, null, new c(this.c, rect, this.G, this.H, this.e, this.f, this.w, this.y, pair, pair2, this.B, null), 3)};
                this.b = null;
                this.a = 1;
                Object objB = up1.b(ojdVarArr, this);
                return objB == y5bVar ? y5bVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yp40 yp40Var, a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = yp40Var;
            this.c = a6hVar;
            this.d = rect;
            this.e = i;
            this.f = i2;
            this.i = i3;
            this.v = i4;
            this.w = bitmap;
            this.y = z;
            this.z = pair;
            this.A = pair2;
            this.B = i5;
            this.C = i6;
            this.D = i7;
            this.E = i8;
            this.F = i9;
            this.G = i10;
            this.H = i11;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1375a c1375a = new C1375a(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, null);
                this.a = 1;
                objD = w5b.d(c1375a, this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            this.b.a = ((List) objD).contains(Boolean.TRUE);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5h(yp40 yp40Var, a6h a6hVar, Rect rect, int i, int i2, int i3, int i4, Bitmap bitmap, boolean z, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, v1b<? super z5h> v1bVar) {
        super(2, v1bVar);
        this.a = yp40Var;
        this.b = a6hVar;
        this.c = rect;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.i = i4;
        this.v = bitmap;
        this.w = z;
        this.y = pair;
        this.z = pair2;
        this.A = i5;
        this.B = i6;
        this.C = i7;
        this.D = i8;
        this.E = i9;
        this.F = i10;
        this.G = i11;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z5h(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z5h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        dj5.b(new a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null));
        return Unit.a;
    }
}
