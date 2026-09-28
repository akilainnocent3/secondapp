package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nt60 implements mt60 {
    public final Function1<Object, Boolean> a;
    public final rtw<String, List<Object>> b;
    public rtw<String, List<Function0<Object>>> c;

    public static final class a implements mt60.a {
        public final /* synthetic */ rtw<String, List<Function0<Object>>> a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<Object> c;

        public a(rtw<String, List<Function0<Object>>> rtwVar, String str, Function0<? extends Object> function0) {
            this.a = rtwVar;
            this.b = str;
            this.c = function0;
        }

        @Override // mt60.a
        public final void a() {
            rtw<String, List<Function0<Object>>> rtwVar = this.a;
            String str = this.b;
            List<Function0<Object>> listK = rtwVar.k(str);
            if (listK != null) {
                listK.remove(this.c);
            }
            if (listK == null || listK.isEmpty()) {
                return;
            }
            rtwVar.m(str, listK);
        }
    }

    public nt60(Map<String, ? extends List<? extends Object>> map, Function1<Object, Boolean> function1) {
        rtw<String, List<Object>> rtwVar;
        this.a = function1;
        if (map == null || map.isEmpty()) {
            rtwVar = null;
        } else {
            rtwVar = new rtw<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                rtwVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.b = rtwVar;
    }

    @Override // defpackage.mt60
    public final boolean a(Object obj) {
        return this.a.invoke(obj).booleanValue();
    }

    @Override // defpackage.mt60
    public final mt60.a b(String str, Function0<? extends Object> function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.b(str.charAt(i))) {
                rtw<String, List<Function0<Object>>> rtwVarB = this.c;
                if (rtwVarB == null) {
                    rtwVarB = fz60.b();
                    this.c = rtwVarB;
                }
                List<Function0<Object>> listD = rtwVarB.d(str);
                if (listD == null) {
                    listD = new ArrayList<>();
                    rtwVarB.m(str, listD);
                }
                listD.add(function0);
                return new a(rtwVarB, str, function0);
            }
        }
        hb5.a("Registered key is empty or blank");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    @Override // defpackage.mt60
    public final Map<String, List<Object>> d() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        rtw<String, List<Object>> rtwVar = this.b;
        if (rtwVar == null && this.c == null) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        int i3 = 0;
        int i4 = rtwVar != null ? rtwVar.e : 0;
        rtw<String, List<Function0<Object>>> rtwVar2 = this.c;
        HashMap map = new HashMap(i4 + (rtwVar2 != null ? rtwVar2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (rtwVar != null) {
            Object[] objArr = rtwVar.b;
            Object[] objArr2 = rtwVar.c;
            long[] jArr3 = rtwVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        rtw<String, List<Function0<Object>>> rtwVar3 = this.c;
        if (rtwVar3 != null) {
            Object[] objArr3 = rtwVar3.b;
            Object[] objArr4 = rtwVar3.c;
            long[] jArr4 = rtwVar3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            q1b.a(o350.a(objInvoke));
                                            return null;
                                        }
                                        map.put(str, b.f(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            q1b.a(o350.a(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.mt60
    public final Object e(String str) {
        rtw<String, List<Object>> rtwVar = this.b;
        List<Object> listK = rtwVar != null ? rtwVar.k(str) : null;
        if (listK == null || listK.isEmpty()) {
            return null;
        }
        if (listK.size() > 1 && rtwVar != null) {
            List<Object> listSubList = listK.subList(1, listK.size());
            int i = rtwVar.i(str);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = rtwVar.c;
            Object obj = objArr[i];
            rtwVar.b[i] = str;
            objArr[i] = listSubList;
        }
        return listK.get(0);
    }
}
