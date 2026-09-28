package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k230 {
    public final zzr a;
    public final v5b b;
    public final HashSet<Object> c;
    public final zaf d;
    public b e;
    public jvd0 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("Backward", 0);
            a = aVar;
            a aVar2 = new a("Forward", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b {
        public final a a;
        public final float b;

        public b(a aVar, float f) {
            this.a = aVar;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ScrollJobInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ")";
        }
    }

    @c0d(c = "com.sporty.android.compose.ui.state.ProgrammaticScroller$start$1", f = "ProgrammaticScroller.kt", l = {79}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ a d;
        public final /* synthetic */ float e;
        public final /* synthetic */ Function0<zyr> f;

        @c0d(c = "com.sporty.android.compose.ui.state.ProgrammaticScroller$start$1$1", f = "ProgrammaticScroller.kt", l = {70}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ k230 b;
            public final /* synthetic */ float c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k230 k230Var, float f, v1b v1bVar) {
                super(2, v1bVar);
                this.b = k230Var;
                this.c = f;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
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
                    zzr zzrVar = this.b.a;
                    gzg0 gzg0VarE = yi0.e(100, 0, xkf.d, 2);
                    this.a = 1;
                    if (ts7.a(zzrVar, this.c, gzg0VarE, this) == y5bVar) {
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

        @c0d(c = "com.sporty.android.compose.ui.state.ProgrammaticScroller$start$1$2", f = "ProgrammaticScroller.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ k230 a;
            public final /* synthetic */ Function0<zyr> b;
            public final /* synthetic */ a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(k230 k230Var, Function0<? extends zyr> function0, a aVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.a = k230Var;
                this.b = function0;
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.a, this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x007f  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Boolean boolValueOf;
                zyr zyrVar;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                k230 k230Var = this.a;
                HashSet<Object> hashSet = k230Var.c;
                zyr zyrVarInvoke = this.b.invoke();
                if (zyrVarInvoke != null) {
                    kzr kzrVarJ = k230Var.a.j();
                    i3z i3zVar = i3z.a;
                    int iIntValue = ((Number) l230.a(kzrVarJ).b).intValue();
                    List<zyr> listK = kzrVarJ.k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listK) {
                        zyr zyrVar2 = (zyr) obj2;
                        if (zyrVar2.getOffset() >= 0) {
                            if (zyrVar2.a() + zyrVar2.getOffset() <= iIntValue) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    a aVar = this.c;
                    int iOrdinal = aVar.ordinal();
                    Object obj3 = null;
                    int i = 0;
                    if (iOrdinal == 0) {
                        zyr zyrVar3 = (zyr) CollectionsKt.firstOrNull(arrayList);
                        if (zyrVar3 != null) {
                            boolValueOf = Boolean.valueOf(zyrVarInvoke.getIndex() < zyrVar3.getIndex());
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return null;
                        }
                        zyr zyrVar4 = (zyr) CollectionsKt.d0(arrayList);
                        if (zyrVar4 != null) {
                            boolValueOf = Boolean.valueOf(zyrVarInvoke.getIndex() > zyrVar4.getIndex());
                        } else {
                            boolValueOf = null;
                        }
                    }
                    if (!(boolValueOf != null ? boolValueOf.booleanValue() : false)) {
                        int iOrdinal2 = aVar.ordinal();
                        if (iOrdinal2 == 0) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj4 = arrayList.get(i);
                                i++;
                                zyr zyrVar5 = (zyr) obj4;
                                zyrVar5.getClass();
                                if (hashSet.contains(zyrVar5.getKey())) {
                                    obj3 = obj4;
                                    break;
                                }
                            }
                            zyrVar = (zyr) obj3;
                        } else {
                            if (iOrdinal2 != 1) {
                                uhc.a();
                                return null;
                            }
                            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                            while (listIterator.hasPrevious()) {
                                Object objPrevious = listIterator.previous();
                                zyr zyrVar6 = (zyr) objPrevious;
                                zyrVar6.getClass();
                                if (hashSet.contains(zyrVar6.getKey())) {
                                    obj3 = objPrevious;
                                    break;
                                }
                            }
                            zyrVar = (zyr) obj3;
                        }
                        if (zyrVar != null && zyrVar.getIndex() != zyrVarInvoke.getIndex()) {
                            k230Var.d.invoke(zyrVarInvoke, zyrVar);
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(a aVar, float f, Function0<? extends zyr> function0, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = aVar;
            this.e = f;
            this.f = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = k230.this.new c(this.d, this.e, this.f, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean zD;
            k230 k230Var = k230.this;
            a aVar = this.d;
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    uj50.b(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            do {
                zzr zzrVar = k230Var.a;
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    zD = zzrVar.d();
                } else {
                    if (iOrdinal != 1) {
                        throw new uwx();
                    }
                    zD = zzrVar.e();
                }
                if (!zD) {
                    return Unit.a;
                }
                int iOrdinal2 = aVar.ordinal();
                float f = this.e;
                if (iOrdinal2 == 0) {
                    f = -f;
                } else if (iOrdinal2 != 1) {
                    throw new uwx();
                }
                ej5.c(v5bVar, null, null, new a(k230Var, f, null), 3);
                ej5.c(v5bVar, null, null, new b(k230Var, this.f, aVar, null), 3);
                this.b = v5bVar;
                this.a = 1;
            } while (hkd.b(100L, this) != y5bVar);
            return y5bVar;
        }
    }

    public k230(zzr zzrVar, v5b v5bVar, HashSet hashSet, zaf zafVar) {
        i3z i3zVar = i3z.a;
        v5bVar.getClass();
        this.a = zzrVar;
        this.b = v5bVar;
        this.c = hashSet;
        this.d = zafVar;
    }

    public final void a(Function0<? extends zyr> function0, a aVar, float f) {
        boolean zD;
        b bVar = new b(aVar, f);
        if (Intrinsics.g(this.e, bVar)) {
            return;
        }
        i3z i3zVar = i3z.a;
        zzr zzrVar = this.a;
        float fD = ((int) (zzrVar.j().d() & 4294967295L)) * 0.05f * f;
        jvd0 jvd0Var = this.f;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = null;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            zD = zzrVar.d();
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            zD = zzrVar.e();
        }
        if (zD) {
            this.e = bVar;
            this.f = ej5.c(this.b, null, null, new c(aVar, fD, function0, null), 3);
        }
    }
}
