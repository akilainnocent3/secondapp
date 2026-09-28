package tvo.webrtc;

/* JADX INFO: loaded from: classes8.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.2
            @Override // tvo.webrtc.Predicate
            public boolean test(T t) {
                return Predicate.this.test(t) && predicate.test(t);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.3
            @Override // tvo.webrtc.Predicate
            public boolean test(T t) {
                return !Predicate.this.test(t);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>() { // from class: tvo.webrtc.Predicate.1
            @Override // tvo.webrtc.Predicate
            public boolean test(T t) {
                return Predicate.this.test(t) || predicate.test(t);
            }
        };
    }

    boolean test(T t);
}
