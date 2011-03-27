class AliceHomePage

  attr_accessor :search_field, :google_search_button

  URLS = { :local => "http://localhost:8090/" }

  def initialize(browser)
    @browser = browser
  end

  def method_missing(sym, *args, &block)
    @browser.send sym, *args, &block
  end

  def visit
    @browser.goto URLS[:local]
  end

  def page_title
    @browser.title
  end

end
