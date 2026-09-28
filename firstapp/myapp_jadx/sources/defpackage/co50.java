package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class co50 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        IOException iOException = (IOException) obj;
        return (iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException) || (iOException instanceof UnknownHostException) || (iOException instanceof SocketException);
    }
}
