package com.yandex.div.core.view2.errors;

import com.yandex.div.core.Disposable;
import dr.w2;
import ds.p;
import fr.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mq.m7;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ErrorCollector {

    @l
    private final Set<p<List<? extends Throwable>, List<? extends Throwable>, w2>> observers = new LinkedHashSet();

    @l
    private final List<Throwable> runtimeErrors = new ArrayList();

    @l
    private List<? extends Throwable> parsingErrors = h0.J();

    @l
    private List<Throwable> warnings = new ArrayList();

    @l
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector errorCollector, p pVar) {
        errorCollector.observers.remove(pVar);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(@m m7 m7Var) {
        List<Exception> listJ;
        if (m7Var == null || (listJ = m7Var.f111792h) == null) {
            listJ = h0.J();
        }
        this.parsingErrors = listJ;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    @l
    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(@l Throwable th2) {
        this.runtimeErrors.add(th2);
        notifyObservers();
    }

    public void logWarning(@l Throwable th2) {
        this.warnings.add(th2);
        notifyObservers();
    }

    @l
    public Disposable observeAndGet(@l final p<? super List<? extends Throwable>, ? super List<? extends Throwable>, w2> pVar) {
        this.observers.add(pVar);
        rebuildErrors();
        pVar.invoke(this.errors, this.warnings);
        return new Disposable() { // from class: com.yandex.div.core.view2.errors.c
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.observeAndGet$lambda$1(this.f76644b, pVar);
            }
        };
    }
}
