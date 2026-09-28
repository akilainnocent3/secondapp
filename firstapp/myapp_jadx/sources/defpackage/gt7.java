package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gt7 implements ht7<Float> {
    public final float a;
    public final float b;

    public gt7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ht7
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.it7
    public final boolean c(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    @Override // defpackage.it7
    public final Comparable d() {
        return Float.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt7)) {
            return false;
        }
        if (isEmpty() && ((gt7) obj).isEmpty()) {
            return true;
        }
        gt7 gt7Var = (gt7) obj;
        return this.a == gt7Var.a && this.b == gt7Var.b;
    }

    @Override // defpackage.it7
    public final Comparable getStart() {
        return Float.valueOf(this.a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // defpackage.it7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
