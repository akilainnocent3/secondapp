package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class eo50 implements Interceptor {
    public static final Logger f = Logger.getLogger(eo50.class.getName());
    public final hk1 a;
    public final gmy b;
    public final Predicate<IOException> c;
    public final sq20 d;
    public final do50 e;

    public eo50() {
        throw null;
    }

    public eo50(hk1 hk1Var, gmy gmyVar) {
        Predicate<IOException> co50Var = hk1Var.e() == null ? new co50() : hk1Var.e();
        Objects.requireNonNull(TimeUnit.NANOSECONDS);
        sq20 sq20Var = new sq20();
        do50 do50Var = new do50();
        this.a = hk1Var;
        this.b = gmyVar;
        this.c = co50Var;
        this.d = sq20Var;
        this.e = do50Var;
    }

    public static String a(Response response) {
        StringJoiner stringJoiner = new StringJoiner(",", "Response{", "}");
        stringJoiner.add("code=" + response.code());
        stringJoiner.add("headers=" + ((String) response.headers().toMultimap().entrySet().stream().map(new bo50()).collect(Collectors.joining(",", "[", "]"))));
        return stringJoiner.toString();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0062 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:12:0x005c, B:14:0x0062, B:16:0x0076, B:20:0x008b, B:25:0x00a7, B:26:0x00ae), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0076 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:12:0x005c, B:14:0x0062, B:16:0x0076, B:20:0x008b, B:25:0x00a7, B:26:0x00ae), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a7 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:12:0x005c, B:14:0x0062, B:16:0x0076, B:20:0x008b, B:25:0x00a7, B:26:0x00ae), top: B:44:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[SYNTHETIC] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        boolean zEquals;
        Level level;
        String str;
        Logger logger = f;
        hk1 hk1Var = this.a;
        long nanos = hk1Var.b().toNanos();
        IOException iOException = null;
        int i = 0;
        Response responseProceed = null;
        do {
            if (i > 0) {
                double dMin = Math.min(nanos, hk1Var.d().toNanos());
                long jDoubleValue = (long) (((Double) this.e.get()).doubleValue() * dMin);
                nanos = (long) (hk1Var.a() * dMin);
                try {
                    getClass();
                    TimeUnit.NANOSECONDS.sleep(jDoubleValue);
                    if (responseProceed != null) {
                        responseProceed.close();
                    }
                    iOException = null;
                    try {
                        try {
                            responseProceed = chain.proceed(chain.request());
                            if (responseProceed != null) {
                                throw new NullPointerException("response cannot be null.");
                            }
                            zEquals = Boolean.TRUE.equals(this.b.apply(responseProceed));
                            level = Level.FINER;
                            if (logger.isLoggable(level)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Attempt ");
                                sb.append(i);
                                sb.append(" returned ");
                                if (zEquals) {
                                    str = "retryable";
                                } else {
                                    str = "non-retryable";
                                }
                                sb.append(str);
                                sb.append(" response: ");
                                sb.append(a(responseProceed));
                                logger.log(level, sb.toString());
                            }
                            if (!zEquals) {
                                return responseProceed;
                            }
                        } catch (IOException e) {
                            e = e;
                            boolean zTest = this.c.test(e);
                            Level level2 = Level.FINER;
                            if (logger.isLoggable(level2)) {
                                logger.log(level2, uf80.a(efe0.a(i, "Attempt ", " failed with "), zTest ? "retryable" : "non-retryable", " exception"), (Throwable) e);
                            }
                            if (!zTest) {
                                throw e;
                            }
                            iOException = e;
                            responseProceed = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                    i++;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } else {
                responseProceed = chain.proceed(chain.request());
                if (responseProceed != null) {
                    throw new NullPointerException("response cannot be null.");
                }
                zEquals = Boolean.TRUE.equals(this.b.apply(responseProceed));
                level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Attempt ");
                    sb2.append(i);
                    sb2.append(" returned ");
                    if (zEquals) {
                        str = "retryable";
                    } else {
                        str = "non-retryable";
                    }
                    sb2.append(str);
                    sb2.append(" response: ");
                    sb2.append(a(responseProceed));
                    logger.log(level, sb2.toString());
                }
                if (!zEquals) {
                    return responseProceed;
                }
                i++;
            }
            if (responseProceed != null) {
                return responseProceed;
            }
            throw iOException;
        } while (i < hk1Var.c());
        if (responseProceed != null) {
            return responseProceed;
        }
        throw iOException;
    }
}
