package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class c790 implements lyh<List<? extends x590>> {
    public final /* synthetic */ zed.d0 a;
    public final /* synthetic */ h790 b;
    public final /* synthetic */ Type c;

    @c0d(c = "com.sportybet.repository.shortcut.ShortcutRepositoryImpl$getShortcutsFlow$$inlined$map$1", f = "ShortcutRepositoryImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return c790.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ h790 b;
        public final /* synthetic */ Type c;

        @c0d(c = "com.sportybet.repository.shortcut.ShortcutRepositoryImpl$getShortcutsFlow$$inlined$map$1$2", f = "ShortcutRepositoryImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, h790 h790Var, Type type) {
            this.a = myhVar;
            this.b = h790Var;
            this.c = type;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v3, types: [uag] */
        /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            ?? arrayList;
            Object next;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                String str = (String) obj;
                int length = str.length();
                h790 h790Var = this.b;
                if (length > 0) {
                    Object objFromJson = h790Var.b.fromJson(str, this.c);
                    objFromJson.getClass();
                    Iterable iterable = (Iterable) objFromJson;
                    arrayList = new ArrayList(l48.r(iterable, 10));
                    Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        uag uagVar = x590.w;
                        q3.b bVarA = ocx.a(uagVar, uagVar);
                        do {
                            if (!bVarA.hasNext()) {
                                next = null;
                                break;
                            }
                            next = bVarA.next();
                        } while (((x590) next).a != iIntValue);
                        x590 x590Var = (x590) next;
                        if (x590Var == null) {
                            x590Var = x590.Home;
                        }
                        arrayList.add(x590Var);
                    }
                } else {
                    arrayList = x590.w;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!h790Var.d.contains((x590) obj3)) {
                        arrayList2.add(obj3);
                    }
                }
                aVar.b = 1;
                if (this.a.emit(arrayList2, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public c790(zed.d0 d0Var, h790 h790Var, Type type) {
        this.a = d0Var;
        this.b = h790Var;
        this.c = type;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends x590>> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b, this.c);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
