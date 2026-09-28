package defpackage;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ffx {
    public final djx<Object> a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Object e;

    public static final class a {
        public djx<Object> a;
        public boolean b;
        public Object c;
        public boolean d;
        public boolean e;

        /* JADX WARN: Code duplicated, block: B:46:0x008d  */
        /* JADX WARN: Code duplicated, block: B:48:0x0097  */
        /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:59:0x00db  */
        /* JADX WARN: Code duplicated, block: B:60:0x00e5  */
        public final ffx a() {
            djx gVar;
            Class<?> componentType;
            djx djxVar = this.a;
            if (djxVar == null) {
                Object obj = this.c;
                if (obj instanceof Integer) {
                    gVar = djx.b;
                } else if (obj instanceof int[]) {
                    gVar = djx.d;
                } else if (obj instanceof Long) {
                    gVar = djx.f;
                } else if (obj instanceof long[]) {
                    gVar = djx.g;
                } else if (obj instanceof Float) {
                    gVar = djx.i;
                } else if (obj instanceof float[]) {
                    gVar = djx.j;
                } else if (obj instanceof Boolean) {
                    gVar = djx.l;
                } else if (obj instanceof boolean[]) {
                    gVar = djx.m;
                } else {
                    gVar = ((obj instanceof String) || obj == null) ? djx.o : null;
                }
                if (gVar != null) {
                    djxVar = gVar;
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    djxVar = djx.p;
                } else {
                    obj.getClass();
                    if (obj.getClass().isArray()) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        componentType2.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType2)) {
                            Class<?> componentType3 = obj.getClass().getComponentType();
                            componentType3.getClass();
                            gVar = new djx.d(componentType3);
                        } else if (obj.getClass().isArray()) {
                            componentType = obj.getClass().getComponentType();
                            componentType.getClass();
                            if (Serializable.class.isAssignableFrom(componentType)) {
                                Class<?> componentType4 = obj.getClass().getComponentType();
                                componentType4.getClass();
                                gVar = new djx.f(componentType4);
                            } else if (obj instanceof Parcelable) {
                                gVar = new djx.e(obj.getClass());
                            } else if (obj instanceof Enum) {
                                gVar = new djx.c(obj.getClass());
                            } else {
                                if (obj instanceof Serializable) {
                                    d9h0.a(obj.getClass().getName(), "Object of type ", " is not supported for navigation arguments.");
                                    return null;
                                }
                                gVar = new djx.g(obj.getClass());
                            }
                        } else if (obj instanceof Parcelable) {
                            gVar = new djx.e(obj.getClass());
                        } else if (obj instanceof Enum) {
                            gVar = new djx.c(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                d9h0.a(obj.getClass().getName(), "Object of type ", " is not supported for navigation arguments.");
                                return null;
                            }
                            gVar = new djx.g(obj.getClass());
                        }
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType5 = obj.getClass().getComponentType();
                            componentType5.getClass();
                            gVar = new djx.f(componentType5);
                        } else if (obj instanceof Parcelable) {
                            gVar = new djx.e(obj.getClass());
                        } else if (obj instanceof Enum) {
                            gVar = new djx.c(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                d9h0.a(obj.getClass().getName(), "Object of type ", " is not supported for navigation arguments.");
                                return null;
                            }
                            gVar = new djx.g(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        gVar = new djx.e(obj.getClass());
                    } else if (obj instanceof Enum) {
                        gVar = new djx.c(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            d9h0.a(obj.getClass().getName(), "Object of type ", " is not supported for navigation arguments.");
                            return null;
                        }
                        gVar = new djx.g(obj.getClass());
                    }
                    djxVar = gVar;
                }
            }
            return new ffx(djxVar, this.b, this.c, this.d, this.e);
        }
    }

    public ffx(djx<Object> djxVar, boolean z, Object obj, boolean z2, boolean z3) {
        if (!djxVar.a && z) {
            kb5.a(djxVar.b().concat(" does not allow nullable values"));
            throw null;
        }
        if (!z && z2 && obj == null) {
            efx.a(djxVar.b(), "Argument with type ", " has null value but is not nullable.");
            throw null;
        }
        this.a = djxVar;
        this.b = z;
        this.e = obj;
        this.c = z2 || z3;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ffx.class != obj.getClass()) {
            return false;
        }
        ffx ffxVar = (ffx) obj;
        if (this.b != ffxVar.b || this.c != ffxVar.c || !this.a.equals(ffxVar.a)) {
            return false;
        }
        Object obj2 = ffxVar.e;
        Object obj3 = this.e;
        if (obj3 != null) {
            return obj3.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jq40.a(ffx.class).k());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: " + this.e);
        }
        return sb.toString();
    }
}
