package ej;

import cj.q9;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f81319a = new b();

        @Override // ej.d
        public void a(Object event, Iterator<j> subscribers) {
            l0.E(event);
            while (subscribers.hasNext()) {
                subscribers.next().d(event);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue<a> f81320a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f81321a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f81322b;

            public a(Object event, j subscriber) {
                this.f81321a = event;
                this.f81322b = subscriber;
            }
        }

        public c() {
            this.f81320a = q9.f();
        }

        @Override // ej.d
        public void a(Object event, Iterator<j> subscribers) {
            l0.E(event);
            while (subscribers.hasNext()) {
                this.f81320a.add(new a(event, subscribers.next()));
            }
            while (true) {
                a aVarPoll = this.f81320a.poll();
                if (aVarPoll == null) {
                    return;
                } else {
                    aVarPoll.f81322b.d(aVarPoll.f81321a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ej.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0795d extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadLocal<Queue<c>> f81323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ThreadLocal<Boolean> f81324b;

        /* JADX INFO: renamed from: ej.d$d$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends ThreadLocal<Queue<c>> {
            public a() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Queue<c> initialValue() {
                return q9.d();
            }
        }

        /* JADX INFO: renamed from: ej.d$d$b */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b extends ThreadLocal<Boolean> {
            public b() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean initialValue() {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: renamed from: ej.d$d$c */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f81327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<j> f81328b;

            public c(Object event, Iterator<j> subscribers) {
                this.f81327a = event;
                this.f81328b = subscribers;
            }
        }

        public C0795d() {
            this.f81323a = new a();
            this.f81324b = new b();
        }

        @Override // ej.d
        public void a(Object event, Iterator<j> subscribers) {
            l0.E(event);
            l0.E(subscribers);
            Queue<c> queue = this.f81323a.get();
            Objects.requireNonNull(queue);
            Queue<c> queue2 = queue;
            queue2.offer(new c(event, subscribers));
            if (this.f81324b.get().booleanValue()) {
                return;
            }
            this.f81324b.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVarPoll = queue2.poll();
                    if (cVarPoll == null) {
                        this.f81324b.remove();
                        this.f81323a.remove();
                        return;
                    } else {
                        while (cVarPoll.f81328b.hasNext()) {
                            ((j) cVarPoll.f81328b.next()).d(cVarPoll.f81327a);
                        }
                    }
                } catch (Throwable th2) {
                    this.f81324b.remove();
                    this.f81323a.remove();
                    throw th2;
                }
            }
        }
    }

    public static d b() {
        return b.f81319a;
    }

    public static d c() {
        return new c();
    }

    public static d d() {
        return new C0795d();
    }

    public abstract void a(Object event, Iterator<j> subscribers);
}
