package kotlin.time;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends TimeMark, Comparable<a> {

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0775a {
        public static int a(a aVar, a aVar2) {
            aVar2.getClass();
            long jG = aVar.g(aVar2);
            b.b.getClass();
            return b.c(jG, 0L);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    int compareTo(a aVar);

    long g(a aVar);
}
