package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nxo implements nw0<int[]> {
    @Override // defpackage.nw0
    public final int a() {
        return 4;
    }

    @Override // defpackage.nw0
    public final int b(int[] iArr) {
        return iArr.length;
    }

    @Override // defpackage.nw0
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // defpackage.nw0
    public final int[] newArray(int i) {
        return new int[i];
    }
}
