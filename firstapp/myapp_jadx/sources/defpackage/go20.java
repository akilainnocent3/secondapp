package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class go20 extends m1k<go20, a> implements znv {
    private static final go20 DEFAULT_INSTANCE;
    private static volatile rsz<go20> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private fyo.c<String> strings_ = y630.d;

    public static final class a extends m1k.a<go20, a> implements znv {
        public a() {
            super(go20.DEFAULT_INSTANCE);
        }
    }

    static {
        go20 go20Var = new go20();
        DEFAULT_INSTANCE = go20Var;
        m1k.l(go20.class, go20Var);
    }

    public static go20 o() {
        return DEFAULT_INSTANCE;
    }

    public static a q() {
        return (a) ((m1k.a) DEFAULT_INSTANCE.e(m1k.f.e));
    }

    @Override // defpackage.m1k
    public final Object e(m1k.f fVar) {
        rsz bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t040(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new go20();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                rsz<go20> rszVar = PARSER;
                if (rszVar != null) {
                    return rszVar;
                }
                synchronized (go20.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new m1k.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                bl0.a();
                return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(Iterable<String> iterable) {
        fyo.c<String> cVar = this.strings_;
        if (!cVar.isModifiable()) {
            int size = cVar.size();
            this.strings_ = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = this.strings_;
        Charset charset = fyo.a;
        if (!(iterable instanceof z0s)) {
            if (iterable instanceof dw20) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size2 = list.size();
            for (String str : iterable) {
                if (str == null) {
                    String str2 = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    bmy.a(str2);
                    return;
                }
                list.add(str);
            }
            return;
        }
        List<?> underlyingElements = ((z0s) iterable).getUnderlyingElements();
        z0s z0sVar = (z0s) list;
        int size4 = list.size();
        for (Object obj : underlyingElements) {
            if (obj == null) {
                String str3 = "Element at index " + (z0sVar.size() - size4) + " is null.";
                for (int size5 = z0sVar.size() - 1; size5 >= size4; size5--) {
                    z0sVar.remove(size5);
                }
                bmy.a(str3);
                return;
            }
            if (obj instanceof pl5) {
                z0sVar.g();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                pl5.c(bArr, 0, bArr.length);
                z0sVar.g();
            } else {
                z0sVar.add((String) obj);
            }
        }
    }

    public final fyo.c p() {
        return this.strings_;
    }
}
