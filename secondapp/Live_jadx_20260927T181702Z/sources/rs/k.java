package rs;

import fr.h0;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final k f127527a = new k();

    @Override // rs.e
    @l
    public List<Type> a() {
        return h0.J();
    }

    @Override // rs.e
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    @m
    public Void c() {
        return null;
    }

    @Override // rs.e
    @m
    public Object call(@l Object[] args) {
        m0.p(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // rs.e
    @l
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        m0.o(TYPE, "TYPE");
        return TYPE;
    }
}
