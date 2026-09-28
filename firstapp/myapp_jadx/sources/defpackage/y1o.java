package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class y1o {
    public final int a;
    public final float b;
    public final float c;
    public final scn<Integer, gly> d;
    public final float e;
    public final float f;

    public y1o(int i, float f, float f2, scn<Integer, gly> scnVar, float f3, float f4) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = scnVar;
        this.e = f3;
        this.f = f4;
    }

    public static y1o a(y1o y1oVar, int i, float f, scn scnVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            i = y1oVar.a;
        }
        int i3 = i;
        float f4 = (i2 & 2) != 0 ? y1oVar.b : 25.0f;
        if ((i2 & 4) != 0) {
            f = y1oVar.c;
        }
        float f5 = f;
        if ((i2 & 8) != 0) {
            scnVar = y1oVar.d;
        }
        scn scnVar2 = scnVar;
        if ((i2 & 16) != 0) {
            f2 = y1oVar.e;
        }
        float f6 = f2;
        if ((i2 & 32) != 0) {
            f3 = y1oVar.f;
        }
        y1oVar.getClass();
        scnVar2.getClass();
        return new y1o(i3, f4, f5, scnVar2, f6, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1o)) {
            return false;
        }
        y1o y1oVar = (y1o) obj;
        return this.a == y1oVar.a && g7f.b(this.b, y1oVar.b) && Float.compare(this.c, y1oVar.c) == 0 && this.d.equals(y1oVar.d) && Float.compare(this.e, y1oVar.e) == 0 && Float.compare(this.f, y1oVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + tvh.a(this.e, (this.d.hashCode() + tvh.a(this.c, tvh.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "InstantRacingRaceTrackInfo(startingBoxesHeightPx=", ", lanesVerticalPaddingDp=", g7f.c(this.b), ", laneDividersStartX=");
        sbA.append(this.c);
        sbA.append(", lanePositionMap=");
        sbA.append(this.d);
        sbA.append(", finishLineStartX=");
        sbA.append(this.e);
        sbA.append(", raceEndX=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
