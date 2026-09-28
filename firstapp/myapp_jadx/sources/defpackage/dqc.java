package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class dqc extends IOException {
    public final int a;

    public dqc(int i) {
        this.a = i;
    }

    public dqc(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public dqc(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
