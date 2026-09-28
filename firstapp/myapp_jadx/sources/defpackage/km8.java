package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes8.dex */
public final class km8 extends tu5.a {

    public static final class a<R> implements tu5<R, CompletableFuture<R>> {
        public final Type a;

        /* JADX INFO: renamed from: km8$a$a, reason: collision with other inner class name */
        public class C0769a implements gv5<R> {
            public final b a;

            public C0769a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.gv5
            public final void onFailure(su5<R> su5Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.gv5
            public final void onResponse(su5<R> su5Var, bi50<R> bi50Var) {
                boolean isSuccessful = bi50Var.a.getIsSuccessful();
                b bVar = this.a;
                if (isSuccessful) {
                    bVar.complete(bi50Var.b);
                } else {
                    bVar.completeExceptionally(new tom(bi50Var));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // defpackage.tu5
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.tu5
        public final Object b(su5 su5Var) {
            b bVar = new b(su5Var);
            su5Var.G(new C0769a(bVar));
            return bVar;
        }
    }

    public static final class b<T> extends CompletableFuture<T> {
        public final su5<?> a;

        public b(su5<?> su5Var) {
            this.a = su5Var;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.a.cancel();
            }
            return super.cancel(z);
        }
    }

    public static final class c<R> implements tu5<R, CompletableFuture<bi50<R>>> {
        public final Type a;

        public class a implements gv5<R> {
            public final b a;

            public a(b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.gv5
            public final void onFailure(su5<R> su5Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // defpackage.gv5
            public final void onResponse(su5<R> su5Var, bi50<R> bi50Var) {
                this.a.complete(bi50Var);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // defpackage.tu5
        public final Type a() {
            return this.a;
        }

        @Override // defpackage.tu5
        public final Object b(su5 su5Var) {
            b bVar = new b(su5Var);
            su5Var.G(new a(bVar));
            return bVar;
        }
    }

    @Override // tu5.a
    public final tu5<?, ?> a(Type type, Annotation[] annotationArr, on50 on50Var) {
        if (urh0.e(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            ib5.a("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
            return null;
        }
        Type typeD = urh0.d(0, (ParameterizedType) type);
        if (urh0.e(typeD) != bi50.class) {
            return new a(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new c(urh0.d(0, (ParameterizedType) typeD));
        }
        ib5.a("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        return null;
    }
}
