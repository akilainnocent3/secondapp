package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class raj extends fv5 implements qaj, chp {
    private final int arity;

    public raj(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.fv5
    public xgp computeReflected() {
        jq40.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof raj) {
            raj rajVar = (raj) obj;
            return getName().equals(rajVar.getName()) && getSignature().equals(rajVar.getSignature()) && Intrinsics.g(getBoundReceiver(), rajVar.getBoundReceiver()) && Intrinsics.g(getOwner(), rajVar.getOwner());
        }
        if (obj instanceof chp) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.qaj
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.fv5
    public chp getReflected() {
        return (chp) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.chp
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.chp
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.chp
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.chp
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.fv5, defpackage.xgp
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        xgp xgpVarCompute = compute();
        if (xgpVarCompute != this) {
            return xgpVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public raj(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public raj(int i) {
        this(i, fv5.NO_RECEIVER, null, null, null, 0);
    }
}
