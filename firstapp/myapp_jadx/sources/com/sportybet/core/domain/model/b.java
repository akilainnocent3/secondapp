package com.sportybet.core.domain.model;

import defpackage.c04;
import defpackage.ocx;
import defpackage.q3;
import defpackage.uag;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.sportybet.core.domain.model.b[], still in use, count: 1, list:
  (r0v1 com.sportybet.core.domain.model.b[]) from 0x0031: CONSTRUCTOR (r0v1 com.sportybet.core.domain.model.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:50) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements c04 {
    None(-1),
    All(0),
    RealSports(1),
    /* JADX INFO: Fake field, exist only in values array */
    BetMakersRacing(141);

    public static final a b = new a();
    public static final /* synthetic */ uag i;
    public final int a;

    public static final class a {
        public static b a(int i) {
            Object next;
            uag uagVar = b.i;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (((b) next).a != i);
            b bVar = (b) next;
            return bVar == null ? b.None : bVar;
        }
    }

    static {
        i = new uag(new b[]{r0, r1, r2, new b(141)});
    }

    public b(int i2) {
        super(str, i);
        this.a = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }

    @Override // defpackage.c04
    public final int getId() {
        return this.a;
    }
}
