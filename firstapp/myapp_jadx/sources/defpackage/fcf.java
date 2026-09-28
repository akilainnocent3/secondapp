package defpackage;

import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import fcf.a;
import fcf.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class fcf {
    public final i3z a;
    public final asr b;
    public final Function0<Unit> c;
    public final Function2<Integer, Integer, Unit> d;
    public final ArrayList e;
    public final SnapshotStateList<wd0<Float, ij0>> f;
    public final ytw g;
    public final ytw h;
    public final mae i;
    public final SnapshotStateList<kcf> j;

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListState$draggableStates$1$1$1", f = "DraggableList.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fcf.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SnapshotStateList<wd0<Float, ij0>> snapshotStateList = fcf.this.f;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                int i2 = this.c;
                wd0<Float, ij0> wd0Var = snapshotStateList.get(i2);
                Float f = new Float(((Number) ((x5a0) snapshotStateList.get(i2).e).getValue()).floatValue() + this.d);
                this.a = 1;
                if (wd0Var.f(this, f) == y5bVar) {
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

    @c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableListState$draggableStates$1$1$2$1", f = "DraggableList.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ float d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, float f, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fcf.this.new b(this.c, this.d, v1bVar);
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
                wd0<Float, ij0> wd0Var = fcf.this.f.get(this.c);
                Float f = new Float(this.d);
                fkd0<Float> fkd0Var = lbf.a;
                this.a = 1;
                if (wd0.a(wd0Var, f, fkd0Var, null, null, this, 12) == y5bVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public fcf(int i, final float f, final v5b v5bVar, i3z i3zVar, asr asrVar, Function0<Unit> function0, Function2<? super Integer, ? super Integer, Unit> function2) {
        v5bVar.getClass();
        asrVar.getClass();
        function0.getClass();
        function2.getClass();
        this.a = i3zVar;
        this.b = asrVar;
        this.c = function0;
        this.d = function2;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new r2p(0));
        }
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList2.add(ee0.a(0.0f));
        }
        SnapshotStateList<wd0<Float, ij0>> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(arrayList2);
        this.f = snapshotStateList;
        this.g = m.b(null);
        this.h = m.b(null);
        this.i = a6a0.b(new Function0() { // from class: zbf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(((Integer) ((x5a0) this.a.g).getValue()) != null);
            }
        });
        ArrayList arrayList3 = new ArrayList(i);
        for (final int i4 = 0; i4 < i; i4++) {
            Function1 function1 = new Function1() { // from class: acf
                /* JADX WARN: Code duplicated, block: B:19:0x00a8  */
                /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
                /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws Throwable {
                    float f2;
                    float f3;
                    float f4;
                    acf acfVar = this;
                    float fFloatValue = ((Float) obj).floatValue();
                    int i5 = i4;
                    fcf fcfVar = acfVar.a;
                    mae maeVarB = a6a0.b(new bcf(i5, fcfVar));
                    SnapshotStateList<wd0<Float, ij0>> snapshotStateList2 = fcfVar.f;
                    ArrayList arrayList4 = fcfVar.e;
                    if (!((Boolean) maeVarB.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    Throwable th = null;
                    fcf.a aVar = fcfVar.new a(i5, fFloatValue, null);
                    v5b v5bVar2 = v5bVar;
                    ej5.c(v5bVar2, null, null, aVar, 3);
                    float f5 = ((r2p) arrayList4.get(i5)).a;
                    r2p r2pVar = (r2p) arrayList4.get(i5);
                    float f6 = r2pVar.a + r2pVar.b;
                    int i6 = ((r2p) arrayList4.get(i5)).b;
                    float fFloatValue2 = ((Number) ((x5a0) snapshotStateList2.get(i5).e).getValue()).floatValue() + ((r2p) arrayList4.get(i5)).a;
                    float f7 = i6;
                    float f8 = fFloatValue2 + f7;
                    int size = arrayList4.size();
                    boolean z = false;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList4.get(i7);
                        i7++;
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            b.q();
                            throw th;
                        }
                        r2p r2pVar2 = (r2p) obj2;
                        if (i8 != i5) {
                            f2 = f5;
                            float f9 = f;
                            if (fFloatValue2 < f5) {
                                float f10 = r2pVar2.a + (r2pVar2.b / 2);
                                if (fFloatValue2 <= f10 && f10 <= f2) {
                                    f3 = f9 + f7;
                                } else if (fFloatValue2 > f2) {
                                    f4 = r2pVar2.a + (r2pVar2.b / 2);
                                    if (f6 <= f4 || f4 > f8) {
                                        f3 = 0.0f;
                                    } else {
                                        f3 = -(f9 + f7);
                                    }
                                } else {
                                    f3 = 0.0f;
                                }
                            } else if (fFloatValue2 > f2) {
                                f4 = r2pVar2.a + (r2pVar2.b / 2);
                                if (f6 <= f4) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = 0.0f;
                                }
                            } else {
                                f3 = 0.0f;
                            }
                            if (((Number) ((x5a0) snapshotStateList2.get(i8).e).getValue()).floatValue() != f3) {
                                th = null;
                                ej5.c(v5bVar2, null, null, fcfVar.new b(i8, f3, null), 3);
                                z = true;
                            }
                            acfVar = this;
                            i8 = i9;
                            f5 = f2;
                        } else {
                            f2 = f5;
                        }
                        th = null;
                        acfVar = this;
                        i8 = i9;
                        f5 = f2;
                    }
                    if (z) {
                        fcfVar.c.invoke();
                    }
                    return Unit.a;
                }
            };
            y9f.a aVar = y9f.a;
            arrayList3.add(new xbd(function1));
        }
        SnapshotStateList<kcf> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(arrayList3);
        this.j = snapshotStateList2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0201, code lost:
    
        if (defpackage.wd0.a(r3, r6, r7, r8, null, r10, 8) == r4) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(float r18, final int r19, defpackage.x1b r20) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcf.a(float, int, x1b):java.lang.Object");
    }
}
