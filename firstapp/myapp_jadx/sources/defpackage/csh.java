package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class csh implements bsh {
    public final String a;
    public final int b;

    public csh(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.bsh
    public final String a() {
        return this.b == 0 ? "" : this.a;
    }

    @Override // defpackage.bsh
    public final long b() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = a().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(tug.a("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    @Override // defpackage.bsh
    public final double c() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = a().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(tug.a("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    @Override // defpackage.bsh
    public final boolean d() {
        if (this.b != 0) {
            String strTrim = a().trim();
            if (uoa.e.matcher(strTrim).matches()) {
                return true;
            }
            if (!uoa.f.matcher(strTrim).matches()) {
                hb5.a(tug.a("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.bsh
    public final int getSource() {
        return this.b;
    }
}
