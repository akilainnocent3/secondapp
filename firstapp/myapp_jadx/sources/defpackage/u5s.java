package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class u5s<Key, Value> extends wqz<Key, Value> implements xl8 {
    public final CoroutineContext b;
    public final aqc<Key, Value> c;
    public int d;

    public /* synthetic */ class a implements aqc.e, paj {
        public final /* synthetic */ u5s<Key, Value> a;

        public a(u5s<Key, Value> u5sVar) {
            this.a = u5sVar;
        }

        @Override // aqc.e
        public final void a() {
            this.a.c();
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return new saj(0, this.a, u5s.class, "invalidate", "invalidate()V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof aqc.e) && (obj instanceof paj)) {
                return c().equals(((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public static final class b extends qlr implements Function0<Unit> {
        public final /* synthetic */ u5s<Key, Value> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u5s<Key, Value> u5sVar) {
            super(0);
            this.a = u5sVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            u5s<Key, Value> u5sVar = this.a;
            aqc<Key, Value> aqcVar = u5sVar.c;
            v5s v5sVar = new v5s(u5sVar);
            aqcVar.getClass();
            aqcVar.b.c(v5sVar);
            aqcVar.b.a();
            return Unit.a;
        }
    }

    public u5s(CoroutineContext coroutineContext, aqc<Key, Value> aqcVar) {
        coroutineContext.getClass();
        aqcVar.getClass();
        this.b = coroutineContext;
        this.c = aqcVar;
        this.d = Integer.MIN_VALUE;
        aqcVar.b.b(new a(this));
        this.a.b(new b(this));
    }

    @Override // defpackage.xl8
    public final void a(int i) {
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.d = i;
        } else {
            q1b.a(rr1.b(new StringBuilder("Page size is already set to "), this.d, '.'));
        }
    }

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
    @Override // defpackage.wqz
    public final Key b(xqz<Key, Value> xqzVar) {
        Key key;
        wqz.b.c cVar;
        wqz.b.c<Key, Value> cVarPrevious;
        Value value;
        int i = xqzVar.d;
        List<wqz.b.c<Key, Value>> list = xqzVar.a;
        Integer num = xqzVar.b;
        aqc<Key, Value> aqcVar = this.c;
        int iOrdinal = aqcVar.a.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (list != null && list.isEmpty()) {
                        value = (Value) null;
                        break;
                    }
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            value = (Value) null;
                            break;
                        }
                        if (!((wqz.b.c) it.next()).a.isEmpty()) {
                            int size = iIntValue - i;
                            while (i2 < list.size() - 1 && size > kotlin.collections.b.j(list.get(i2).a)) {
                                size -= list.get(i2).a.size();
                                i2++;
                            }
                            Iterator<T> it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    ibh0.a("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                cVar = (wqz.b.c) it2.next();
                            } while (cVar.a.isEmpty());
                            ListIterator<wqz.b.c<Key, Value>> listIterator = list.listIterator(list.size());
                            do {
                                if (!listIterator.hasPrevious()) {
                                    ibh0.a("List contains no element matching the predicate.");
                                    return null;
                                }
                                cVarPrevious = listIterator.previous();
                            } while (cVarPrevious.a.isEmpty());
                            if (size >= 0) {
                                if (i2 == list.size() - 1 && size > kotlin.collections.b.j(((wqz.b.c) CollectionsKt.b0(list)).a)) {
                                    value = (Value) CollectionsKt.b0(cVarPrevious.a);
                                    break;
                                }
                                value = list.get(i2).a.get(size);
                                break;
                            }
                            value = (Value) CollectionsKt.T(cVar.a);
                            break;
                        }
                    }
                    if (value != null) {
                        aqcVar.a(value);
                        throw null;
                    }
                }
            }
        } else if (num != null) {
            int iIntValue2 = num.intValue();
            int size2 = iIntValue2 - i;
            for (int i3 = 0; i3 < kotlin.collections.b.j(list) && size2 > kotlin.collections.b.j(list.get(i3).a); i3++) {
                size2 -= list.get(i3).a.size();
            }
            wqz.b.c<Key, Value> cVarA = xqzVar.a(iIntValue2);
            if (cVarA == null || (key = cVarA.b) == null) {
                key = (Key) 0;
            }
            return (Key) Integer.valueOf(key.intValue() + size2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    @Override // defpackage.wqz
    public final Object d(wqz.a aVar, x1b x1bVar) {
        kxs kxsVar;
        int i;
        boolean z = aVar instanceof wqz.a.c;
        if (z) {
            kxsVar = kxs.a;
        } else if (aVar instanceof wqz.a.C1262a) {
            kxsVar = kxs.c;
        } else {
            if (!(aVar instanceof wqz.a.b)) {
                uhc.a();
                return null;
            }
            kxsVar = kxs.b;
        }
        kxs kxsVar2 = kxsVar;
        if (this.d == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i2 = aVar.a;
                if (i2 % 3 == 0) {
                    i = i2 / 3;
                } else {
                    i = aVar.a;
                }
            } else {
                i = aVar.a;
            }
            this.d = i;
        }
        return ej5.d(this.b, new w5s(this, new aqc.g(kxsVar2, aVar.a(), aVar.a, aVar.b, this.d), aVar, null), x1bVar);
    }
}
