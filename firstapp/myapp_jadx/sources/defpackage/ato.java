package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class ato<REQUEST, RESPONSE> {
    public static final Logger m = Logger.getLogger(ato.class.getName());
    public final i1z a;
    public final era0<? super REQUEST> b;
    public final String i;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public String j = null;
    public zqa0<? super REQUEST> k = new xqa0();
    public lra0<? super REQUEST, ? super RESPONSE> l = egd.a;

    public ato(i1z i1zVar, era0 era0Var) {
        Class<?> cls = ccd.a;
        this.a = i1zVar;
        this.b = era0Var;
        this.i = (String) w0g.c.computeIfAbsent("io.opentelemetry.okhttp-3.0", new v0g());
    }

    public final String a() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        Set set = (Set) this.d.stream().filter(new xso()).map(new yso()).flatMap(new zso()).collect(Collectors.toSet());
        int size = set.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (String) set.iterator().next();
        }
        m.log(Level.WARNING, "Multiple schemaUrls were detected: {0}. The built Instrumenter will have no schemaUrl assigned.", set);
        return null;
    }

    public final Set<uqa0> b() {
        return (Set) this.d.stream().filter(new tso()).map(new uso()).flatMap(new vso()).collect(Collectors.toSet());
    }
}
