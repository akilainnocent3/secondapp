package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 40, 49, 55, 58}, m = "invokeSuspend", v = 2)
public final class f1a0 extends ji50 implements Function2<wc80<? super List<Object>>, v1b<? super Unit>, Object> {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Iterator<Object> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1a0(int i, int i2, Iterator it, v1b v1bVar) {
        super(2, v1bVar);
        this.v = i;
        this.w = i2;
        this.y = it;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f1a0 f1a0Var = new f1a0(this.v, this.w, this.y, v1bVar);
        f1a0Var.i = obj;
        return f1a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wc80<? super List<Object>> wc80Var, v1b<? super Unit> v1bVar) {
        return ((f1a0) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator<Object> it;
        lt50 lt50Var;
        ArrayList arrayList;
        int i4;
        Iterator<Object> it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        lt50 lt50Var2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        wc80 wc80Var = (wc80) this.i;
        y5b y5bVar = y5b.a;
        int i9 = this.f;
        int i10 = this.w;
        boolean z2 = true;
        int i11 = this.v;
        if (i9 == 0) {
            uj50.b(obj);
            int i12 = i11 <= 1024 ? i11 : 1024;
            i = i10 - i11;
            Iterator<Object> it3 = this.y;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.i = wc80Var;
                            this.b = arrayList;
                            this.c = it2;
                            this.d = i4;
                            this.e = i;
                            this.f = 1;
                            wc80Var.b(this, arrayList);
                            y5b y5bVar2 = y5b.a;
                            return y5bVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.i = null;
                    this.b = null;
                    this.c = null;
                    this.d = i4;
                    this.e = i;
                    this.f = 2;
                    wc80Var.b(this, arrayList);
                    y5b y5bVar3 = y5b.a;
                    return y5bVar;
                }
            } else {
                lt50 lt50Var3 = new lt50(0, new Object[i12]);
                i2 = i12;
                i3 = i;
                it = it3;
                lt50Var = lt50Var3;
                while (true) {
                    i6 = lt50Var.c;
                    objArr = lt50Var.b;
                    if (it.hasNext()) {
                        i7 = i2;
                        lt50Var2 = lt50Var;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (lt50Var.b() != i6) {
                        ib5.a("ring buffer is full");
                        return null;
                    }
                    int i13 = lt50Var.d;
                    int i14 = lt50Var.e;
                    objArr[(i13 + i14) % i6] = next2;
                    lt50Var.e = i14 + 1;
                    if (lt50Var.b() != i6) {
                        if (lt50Var.e < i11) {
                            ArrayList arrayList2 = new ArrayList(lt50Var);
                            this.i = wc80Var;
                            this.b = lt50Var;
                            this.c = it;
                            this.d = i2;
                            this.e = i3;
                            this.f = 3;
                            wc80Var.b(this, arrayList2);
                            y5b y5bVar4 = y5b.a;
                            return y5bVar;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (lt50Var.d == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = lt50Var.toArray(new Object[i8]);
                        }
                        lt50Var = new lt50(lt50Var.e, array);
                    }
                    z2 = z;
                }
                if (lt50Var2.e > i10) {
                    ArrayList arrayList3 = new ArrayList(lt50Var2);
                    this.i = wc80Var;
                    this.b = lt50Var2;
                    this.c = null;
                    this.d = i7;
                    this.e = i3;
                    this.f = 4;
                    wc80Var.b(this, arrayList3);
                    y5b y5bVar5 = y5b.a;
                    return y5bVar;
                }
                if (!lt50Var2.isEmpty()) {
                    this.i = null;
                    this.b = null;
                    this.c = null;
                    this.d = i7;
                    this.e = i3;
                    this.f = 5;
                    wc80Var.b(this, lt50Var2);
                    y5b y5bVar6 = y5b.a;
                    return y5bVar;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.e;
                    i2 = this.d;
                    it = this.c;
                    lt50Var = (lt50) this.b;
                    uj50.b(obj);
                    lt50Var.c(i10);
                    while (true) {
                        i6 = lt50Var.c;
                        objArr = lt50Var.b;
                        if (it.hasNext()) {
                            i7 = i2;
                            lt50Var2 = lt50Var;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (lt50Var.b() != i6) {
                            ib5.a("ring buffer is full");
                            return null;
                        }
                        int i15 = lt50Var.d;
                        int i16 = lt50Var.e;
                        objArr[(i15 + i16) % i6] = next2;
                        lt50Var.e = i16 + 1;
                        if (lt50Var.b() != i6) {
                            if (lt50Var.e < i11) {
                                ArrayList arrayList4 = new ArrayList(lt50Var);
                                this.i = wc80Var;
                                this.b = lt50Var;
                                this.c = it;
                                this.d = i2;
                                this.e = i3;
                                this.f = 3;
                                wc80Var.b(this, arrayList4);
                                y5b y5bVar7 = y5b.a;
                                return y5bVar;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (lt50Var.d == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = lt50Var.toArray(new Object[i8]);
                            }
                            lt50Var = new lt50(lt50Var.e, array);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.e;
                    i7 = this.d;
                    lt50Var2 = (lt50) this.b;
                    uj50.b(obj);
                    lt50Var2.c(i10);
                } else {
                    if (i9 != 5) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (lt50Var2.e > i10) {
                    ArrayList arrayList5 = new ArrayList(lt50Var2);
                    this.i = wc80Var;
                    this.b = lt50Var2;
                    this.c = null;
                    this.d = i7;
                    this.e = i3;
                    this.f = 4;
                    wc80Var.b(this, arrayList5);
                    y5b y5bVar8 = y5b.a;
                    return y5bVar;
                }
                if (!lt50Var2.isEmpty()) {
                    this.i = null;
                    this.b = null;
                    this.c = null;
                    this.d = i7;
                    this.e = i3;
                    this.f = 5;
                    wc80Var.b(this, lt50Var2);
                    y5b y5bVar9 = y5b.a;
                    return y5bVar;
                }
            }
            uj50.b(obj);
        } else {
            i5 = this.e;
            i4 = this.d;
            it2 = this.c;
            uj50.b(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.i = wc80Var;
                        this.b = arrayList;
                        this.c = it2;
                        this.d = i4;
                        this.e = i;
                        this.f = 1;
                        wc80Var.b(this, arrayList);
                        y5b y5bVar10 = y5b.a;
                        return y5bVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.i = null;
                this.b = null;
                this.c = null;
                this.d = i4;
                this.e = i;
                this.f = 2;
                wc80Var.b(this, arrayList);
                y5b y5bVar11 = y5b.a;
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
