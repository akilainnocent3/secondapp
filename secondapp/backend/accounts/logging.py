import logging

class SafeRequestFilter(logging.Filter):
    """Never serialize request bodies, auth headers or database exception details."""
    def filter(self, record):
        record.msg = 'HTTP request failed (status=%s)'
        record.args = (getattr(record, 'status_code', 'unknown'),)
        record.exc_info = None
        record.exc_text = None
        return True
