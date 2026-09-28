package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cee0 extends b390<Integer> implements uwd0<Integer> {
    @Override // defpackage.uwd0
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.v;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.w + ((long) ((int) ((q() + ((long) this.z)) - this.w)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.v;
            objArr.getClass();
            a(Integer.valueOf(((Number) objArr[((int) ((this.w + ((long) ((int) ((q() + ((long) this.z)) - this.w)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
