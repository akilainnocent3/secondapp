package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class abf {
    public final zzr a;
    public final v5b b;
    public final ytw c;
    public final float d;
    public final ytw e;
    public final mae f;
    public final isw g;
    public final osw h;
    public Integer i;
    public Integer j;
    public float k;
    public final HashSet<Object> l;
    public final k230 m;
    public final ytw n;
    public final wd0<Float, ij0> o;

    @c0d(c = "com.sporty.android.compose.ui.state.DraggableLazyListState$swapItems$1", f = "DraggableLazyListState.kt", l = {294}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ zyr d;
        public final /* synthetic */ zyr e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, zyr zyrVar, zyr zyrVar2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = num;
            this.d = zyrVar;
            this.e = zyrVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return abf.this.new a(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            abf abfVar = abf.this;
            zzr zzrVar = abfVar.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                int iIntValue = this.c.intValue();
                int i2 = zzrVar.i();
                this.a = 1;
                if (zzrVar.k(iIntValue, i2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((Function2) abfVar.c.getValue()).invoke(this.d, this.e);
            return Unit.a;
        }
    }

    public abf(zzr zzrVar, v5b v5bVar, ytw ytwVar, float f) {
        i3z i3zVar = i3z.a;
        v5bVar.getClass();
        this.a = zzrVar;
        this.b = v5bVar;
        this.c = ytwVar;
        this.d = f;
        this.e = m.b(null);
        this.f = a6a0.b(new vaf(this, 0));
        this.g = j.a(0.0f);
        this.h = k.a(0);
        HashSet<Object> hashSet = new HashSet<>();
        this.l = hashSet;
        this.m = new k230(zzrVar, v5bVar, hashSet, new zaf(2, this, abf.class, "swapItems", "swapItems(Landroidx/compose/foundation/lazy/LazyListItemInfo;Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0));
        this.n = m.b(null);
        this.o = ee0.a(0.0f);
    }

    public final zyr a() {
        Object next;
        Iterator<T> it = this.a.j().k().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g(((zyr) next).getKey(), ((x5a0) this.e).getValue())) {
                return (zyr) next;
            }
        }
        next = null;
        return (zyr) next;
    }

    public final float b() {
        int iIntValue;
        zyr zyrVarA = a();
        if (zyrVarA == null) {
            return 0.0f;
        }
        int index = zyrVarA.getIndex();
        Integer num = this.i;
        if (num != null && index == num.intValue()) {
            this.j = null;
            iIntValue = zyrVarA.getOffset();
        } else {
            Integer num2 = this.j;
            iIntValue = num2 != null ? num2.intValue() : zyrVarA.getOffset();
        }
        return (((t5a0) this.g).j() + ((u5a0) this.h).D()) - iIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Integer num, float f, x1b x1bVar) {
        xaf xafVar;
        Object next;
        zyr zyrVar;
        Object obj;
        if (x1bVar instanceof xaf) {
            xafVar = (xaf) x1bVar;
            int i = xafVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xafVar.i = i - Integer.MIN_VALUE;
            } else {
                xafVar = new xaf(this, x1bVar);
            }
        } else {
            xafVar = new xaf(this, x1bVar);
        }
        Object obj2 = xafVar.e;
        y5b y5bVar = y5b.a;
        int i2 = xafVar.i;
        if (i2 == 0) {
            uj50.b(obj2);
            zzr zzrVar = this.a;
            Iterator<T> it = zzrVar.j().k().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((zyr) next).getKey(), num));
            zyrVar = (zyr) next;
            if (zyrVar != null) {
                if (zyrVar.getOffset() < 0) {
                    float offset = zyrVar.getOffset();
                    fkd0 fkd0VarD = yi0.d(0.0f, 0.0f, null, 7);
                    xafVar.a = num;
                    xafVar.b = zyrVar;
                    xafVar.c = zyrVar;
                    xafVar.d = f;
                    xafVar.i = 1;
                    if (ts7.a(zzrVar, offset, fkd0VarD, xafVar) == y5bVar) {
                        obj = num;
                        obj = num;
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f = xafVar.d;
        zyr zyrVar2 = xafVar.c;
        Object obj3 = xafVar.a;
        uj50.b(obj2);
        zyrVar = zyrVar2;
        obj = obj3;
        obj = num;
        obj = num;
        obj = num;
        ((x5a0) this.e).setValue(obj);
        ((u5a0) this.h).k(zyrVar.getOffset());
        this.k = f;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    public final void d(zyr zyrVar, zyr zyrVar2) {
        Integer numValueOf;
        Integer num;
        Integer numValueOf2;
        if (zyrVar.getIndex() == zyrVar2.getIndex()) {
            return;
        }
        if (zyrVar2.getIndex() > zyrVar.getIndex()) {
            numValueOf = Integer.valueOf((zyrVar2.getOffset() + zyrVar2.a()) - zyrVar.a());
        } else {
            numValueOf = Integer.valueOf(zyrVar2.getOffset());
        }
        this.j = numValueOf;
        this.i = Integer.valueOf(zyrVar2.getIndex());
        int index = zyrVar2.getIndex();
        zzr zzrVar = this.a;
        if (index != zzrVar.h()) {
            if (zyrVar.getIndex() == zzrVar.h()) {
                numValueOf2 = Integer.valueOf(zyrVar2.getIndex());
            } else {
                num = null;
            }
            if (num != null) {
                ((Function2) this.c.getValue()).invoke(zyrVar, zyrVar2);
            } else {
                ej5.c(this.b, null, null, new a(num, zyrVar, zyrVar2, null), 3);
            }
        }
        numValueOf2 = Integer.valueOf(zyrVar.getIndex());
        num = numValueOf2;
        if (num != null) {
            ((Function2) this.c.getValue()).invoke(zyrVar, zyrVar2);
        } else {
            ej5.c(this.b, null, null, new a(num, zyrVar, zyrVar2, null), 3);
        }
    }
}
