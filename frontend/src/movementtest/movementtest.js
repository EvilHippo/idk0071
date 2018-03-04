

export class movementtest {

  constructor() {
    this.message = "platformer.js";
    this.htmlText = "<h1>it works!</h1> yay!";
    this.count = 0;
  }

  fetchTest() {
    return `{"width":1000,"height":800,"biggestHeight":1015,"platforms":[{"x":405.0,"y":35.0},{"x":315.0,"y":105.0},{"x":325.0,"y":105.0},{"x":335.0,"y":105.0},{"x":265.0,"y":145.0},{"x":275.0,"y":145.0},{"x":285.0,"y":145.0},{"x":255.0,"y":185.0},{"x":265.0,"y":185.0},{"x":275.0,"y":185.0},{"x":285.0,"y":185.0},{"x":275.0,"y":255.0},{"x":285.0,"y":255.0},{"x":265.0,"y":295.0},{"x":275.0,"y":295.0},{"x":285.0,"y":295.0},{"x":295.0,"y":295.0},{"x":365.0,"y":335.0},{"x":375.0,"y":335.0},{"x":385.0,"y":335.0},{"x":365.0,"y":385.0},{"x":375.0,"y":385.0},{"x":385.0,"y":385.0},{"x":395.0,"y":385.0},{"x":455.0,"y":415.0},{"x":465.0,"y":415.0},{"x":475.0,"y":415.0},{"x":505.0,"y":465.0},{"x":515.0,"y":465.0},{"x":445.0,"y":535.0},{"x":455.0,"y":535.0},{"x":555.0,"y":605.0},{"x":565.0,"y":605.0},{"x":575.0,"y":605.0},{"x":495.0,"y":665.0},{"x":505.0,"y":665.0},{"x":515.0,"y":665.0},{"x":465.0,"y":705.0},{"x":475.0,"y":705.0},{"x":485.0,"y":705.0},{"x":495.0,"y":705.0},{"x":435.0,"y":735.0},{"x":445.0,"y":735.0},{"x":455.0,"y":735.0},{"x":475.0,"y":785.0},{"x":485.0,"y":785.0},{"x":495.0,"y":785.0},{"x":405.0,"y":825.0},{"x":415.0,"y":825.0},{"x":425.0,"y":825.0},{"x":485.0,"y":855.0},{"x":495.0,"y":855.0},{"x":505.0,"y":855.0},{"x":475.0,"y":885.0},{"x":485.0,"y":885.0},{"x":495.0,"y":885.0},{"x":505.0,"y":885.0},{"x":525.0,"y":955.0},{"x":535.0,"y":955.0},{"x":545.0,"y":955.0},{"x":555.0,"y":955.0},{"x":345.0,"y":25.0},{"x":405.0,"y":95.0},{"x":415.0,"y":95.0},{"x":425.0,"y":95.0},{"x":435.0,"y":95.0},{"x":525.0,"y":135.0},{"x":535.0,"y":135.0},{"x":515.0,"y":195.0},{"x":525.0,"y":195.0},{"x":535.0,"y":195.0},{"x":475.0,"y":225.0},{"x":485.0,"y":225.0},{"x":495.0,"y":225.0},{"x":565.0,"y":275.0},{"x":575.0,"y":275.0},{"x":585.0,"y":275.0},{"x":605.0,"y":345.0},{"x":615.0,"y":345.0},{"x":625.0,"y":345.0},{"x":635.0,"y":345.0},{"x":645.0,"y":375.0},{"x":655.0,"y":375.0},{"x":665.0,"y":375.0},{"x":675.0,"y":375.0},{"x":725.0,"y":445.0},{"x":735.0,"y":445.0},{"x":745.0,"y":445.0},{"x":755.0,"y":445.0},{"x":785.0,"y":515.0},{"x":795.0,"y":515.0},{"x":805.0,"y":515.0},{"x":895.0,"y":575.0},{"x":905.0,"y":575.0},{"x":915.0,"y":575.0},{"x":925.0,"y":575.0},{"x":885.0,"y":615.0},{"x":895.0,"y":615.0},{"x":905.0,"y":615.0},{"x":825.0,"y":665.0},{"x":835.0,"y":665.0},{"x":845.0,"y":665.0},{"x":825.0,"y":695.0},{"x":835.0,"y":695.0},{"x":845.0,"y":695.0},{"x":765.0,"y":745.0},{"x":775.0,"y":745.0},{"x":755.0,"y":775.0},{"x":765.0,"y":775.0},{"x":775.0,"y":775.0},{"x":855.0,"y":805.0},{"x":865.0,"y":805.0},{"x":875.0,"y":805.0},{"x":885.0,"y":805.0},{"x":825.0,"y":875.0},{"x":835.0,"y":875.0},{"x":845.0,"y":875.0},{"x":765.0,"y":925.0},{"x":775.0,"y":925.0},{"x":725.0,"y":965.0},{"x":735.0,"y":965.0},{"x":705.0,"y":35.0},{"x":805.0,"y":65.0},{"x":815.0,"y":65.0},{"x":825.0,"y":65.0},{"x":845.0,"y":115.0},{"x":855.0,"y":115.0},{"x":865.0,"y":115.0},{"x":895.0,"y":185.0},{"x":905.0,"y":185.0},{"x":875.0,"y":235.0},{"x":885.0,"y":235.0},{"x":895.0,"y":235.0},{"x":905.0,"y":235.0},{"x":865.0,"y":305.0},{"x":875.0,"y":305.0},{"x":885.0,"y":305.0},{"x":815.0,"y":355.0},{"x":825.0,"y":355.0},{"x":835.0,"y":355.0},{"x":845.0,"y":355.0},{"x":855.0,"y":395.0},{"x":865.0,"y":395.0},{"x":875.0,"y":395.0},{"x":885.0,"y":395.0},{"x":895.0,"y":445.0},{"x":905.0,"y":445.0},{"x":895.0,"y":495.0},{"x":905.0,"y":495.0},{"x":875.0,"y":525.0},{"x":885.0,"y":525.0},{"x":875.0,"y":575.0},{"x":885.0,"y":575.0},{"x":895.0,"y":575.0},{"x":905.0,"y":575.0},{"x":885.0,"y":625.0},{"x":895.0,"y":625.0},{"x":905.0,"y":625.0},{"x":855.0,"y":655.0},{"x":865.0,"y":655.0},{"x":875.0,"y":655.0},{"x":895.0,"y":715.0},{"x":905.0,"y":715.0},{"x":845.0,"y":765.0},{"x":855.0,"y":765.0},{"x":865.0,"y":765.0},{"x":765.0,"y":795.0},{"x":775.0,"y":795.0},{"x":785.0,"y":795.0},{"x":795.0,"y":795.0},{"x":745.0,"y":825.0},{"x":755.0,"y":825.0},{"x":835.0,"y":855.0},{"x":845.0,"y":855.0},{"x":855.0,"y":855.0},{"x":865.0,"y":855.0},{"x":855.0,"y":885.0},{"x":865.0,"y":885.0},{"x":305.0,"y":45.0},{"x":275.0,"y":115.0},{"x":285.0,"y":115.0},{"x":295.0,"y":115.0},{"x":305.0,"y":115.0},{"x":275.0,"y":155.0},{"x":285.0,"y":155.0},{"x":245.0,"y":225.0},{"x":255.0,"y":225.0},{"x":265.0,"y":225.0},{"x":305.0,"y":285.0},{"x":315.0,"y":285.0},{"x":325.0,"y":285.0},{"x":285.0,"y":355.0},{"x":295.0,"y":355.0},{"x":305.0,"y":355.0},{"x":315.0,"y":355.0},{"x":395.0,"y":395.0},{"x":405.0,"y":395.0},{"x":415.0,"y":395.0},{"x":425.0,"y":395.0},{"x":365.0,"y":455.0},{"x":375.0,"y":455.0},{"x":285.0,"y":495.0},{"x":295.0,"y":495.0},{"x":305.0,"y":495.0},{"x":315.0,"y":495.0},{"x":285.0,"y":525.0},{"x":295.0,"y":525.0},{"x":195.0,"y":585.0},{"x":205.0,"y":585.0},{"x":215.0,"y":585.0},{"x":225.0,"y":585.0},{"x":245.0,"y":615.0},{"x":255.0,"y":615.0},{"x":335.0,"y":675.0},{"x":345.0,"y":675.0},{"x":355.0,"y":675.0},{"x":365.0,"y":675.0},{"x":355.0,"y":715.0},{"x":365.0,"y":715.0},{"x":325.0,"y":745.0},{"x":335.0,"y":745.0},{"x":295.0,"y":795.0},{"x":305.0,"y":795.0},{"x":315.0,"y":795.0},{"x":305.0,"y":845.0},{"x":315.0,"y":845.0},{"x":325.0,"y":845.0},{"x":335.0,"y":845.0},{"x":255.0,"y":885.0},{"x":265.0,"y":885.0},{"x":275.0,"y":885.0},{"x":285.0,"y":885.0},{"x":335.0,"y":925.0},{"x":345.0,"y":925.0},{"x":355.0,"y":925.0},{"x":365.0,"y":925.0},{"x":305.0,"y":975.0},{"x":315.0,"y":975.0},{"x":325.0,"y":975.0},{"x":335.0,"y":975.0},{"x":435.0,"y":15.0},{"x":425.0,"y":45.0},{"x":435.0,"y":45.0},{"x":445.0,"y":45.0},{"x":425.0,"y":105.0},{"x":435.0,"y":105.0},{"x":445.0,"y":105.0},{"x":345.0,"y":165.0},{"x":355.0,"y":165.0},{"x":365.0,"y":165.0},{"x":375.0,"y":165.0},{"x":415.0,"y":215.0},{"x":425.0,"y":215.0},{"x":435.0,"y":215.0},{"x":445.0,"y":215.0},{"x":545.0,"y":245.0},{"x":555.0,"y":245.0},{"x":565.0,"y":245.0},{"x":475.0,"y":285.0},{"x":485.0,"y":285.0},{"x":495.0,"y":285.0},{"x":405.0,"y":355.0},{"x":415.0,"y":355.0},{"x":425.0,"y":355.0},{"x":355.0,"y":395.0},{"x":365.0,"y":395.0},{"x":375.0,"y":395.0},{"x":385.0,"y":395.0},{"x":325.0,"y":455.0},{"x":335.0,"y":455.0},{"x":345.0,"y":455.0},{"x":355.0,"y":455.0},{"x":255.0,"y":525.0},{"x":265.0,"y":525.0},{"x":275.0,"y":525.0},{"x":255.0,"y":595.0},{"x":265.0,"y":595.0},{"x":305.0,"y":655.0},{"x":315.0,"y":655.0},{"x":325.0,"y":655.0},{"x":235.0,"y":705.0},{"x":245.0,"y":705.0},{"x":195.0,"y":735.0},{"x":205.0,"y":735.0},{"x":175.0,"y":795.0},{"x":185.0,"y":795.0},{"x":205.0,"y":865.0},{"x":215.0,"y":865.0},{"x":225.0,"y":865.0},{"x":135.0,"y":925.0},{"x":145.0,"y":925.0},{"x":125.0,"y":955.0},{"x":135.0,"y":955.0},{"x":145.0,"y":955.0},{"x":135.0,"y":1015.0},{"x":145.0,"y":1015.0},{"x":725.0,"y":25.0},{"x":785.0,"y":75.0},{"x":795.0,"y":75.0},{"x":745.0,"y":115.0},{"x":755.0,"y":115.0},{"x":765.0,"y":115.0},{"x":825.0,"y":165.0},{"x":835.0,"y":165.0},{"x":775.0,"y":215.0},{"x":785.0,"y":215.0},{"x":795.0,"y":215.0},{"x":805.0,"y":215.0},{"x":775.0,"y":275.0},{"x":785.0,"y":275.0},{"x":795.0,"y":275.0},{"x":895.0,"y":335.0},{"x":905.0,"y":335.0},{"x":915.0,"y":335.0},{"x":855.0,"y":395.0},{"x":865.0,"y":395.0},{"x":875.0,"y":395.0},{"x":885.0,"y":425.0},{"x":895.0,"y":425.0},{"x":905.0,"y":425.0},{"x":915.0,"y":425.0},{"x":845.0,"y":475.0},{"x":855.0,"y":475.0},{"x":885.0,"y":545.0},{"x":895.0,"y":545.0},{"x":905.0,"y":545.0},{"x":895.0,"y":575.0},{"x":905.0,"y":575.0},{"x":895.0,"y":605.0},{"x":905.0,"y":605.0},{"x":915.0,"y":605.0},{"x":925.0,"y":605.0},{"x":895.0,"y":635.0},{"x":905.0,"y":635.0},{"x":915.0,"y":635.0},{"x":895.0,"y":675.0},{"x":905.0,"y":675.0},{"x":915.0,"y":675.0},{"x":895.0,"y":715.0},{"x":905.0,"y":715.0},{"x":915.0,"y":715.0},{"x":885.0,"y":755.0},{"x":895.0,"y":755.0},{"x":905.0,"y":755.0},{"x":875.0,"y":795.0},{"x":885.0,"y":795.0},{"x":815.0,"y":865.0},{"x":825.0,"y":865.0},{"x":835.0,"y":865.0},{"x":755.0,"y":915.0},{"x":765.0,"y":915.0},{"x":5.0,"y":1015.0},{"x":995.0,"y":1015.0},{"x":5.0,"y":1005.0},{"x":995.0,"y":1005.0},{"x":5.0,"y":995.0},{"x":995.0,"y":995.0},{"x":5.0,"y":985.0},{"x":995.0,"y":985.0},{"x":5.0,"y":975.0},{"x":995.0,"y":975.0},{"x":5.0,"y":965.0},{"x":995.0,"y":965.0},{"x":5.0,"y":955.0},{"x":995.0,"y":955.0},{"x":5.0,"y":945.0},{"x":995.0,"y":945.0},{"x":5.0,"y":935.0},{"x":995.0,"y":935.0},{"x":5.0,"y":925.0},{"x":995.0,"y":925.0},{"x":5.0,"y":915.0},{"x":995.0,"y":915.0},{"x":5.0,"y":905.0},{"x":995.0,"y":905.0},{"x":5.0,"y":895.0},{"x":995.0,"y":895.0},{"x":5.0,"y":885.0},{"x":995.0,"y":885.0},{"x":5.0,"y":875.0},{"x":995.0,"y":875.0},{"x":5.0,"y":865.0},{"x":995.0,"y":865.0},{"x":5.0,"y":855.0},{"x":995.0,"y":855.0},{"x":5.0,"y":845.0},{"x":995.0,"y":845.0},{"x":5.0,"y":835.0},{"x":995.0,"y":835.0},{"x":5.0,"y":825.0},{"x":995.0,"y":825.0},{"x":5.0,"y":815.0},{"x":995.0,"y":815.0},{"x":5.0,"y":805.0},{"x":995.0,"y":805.0},{"x":5.0,"y":795.0},{"x":995.0,"y":795.0},{"x":5.0,"y":785.0},{"x":995.0,"y":785.0},{"x":5.0,"y":775.0},{"x":995.0,"y":775.0},{"x":5.0,"y":765.0},{"x":995.0,"y":765.0},{"x":5.0,"y":755.0},{"x":995.0,"y":755.0},{"x":5.0,"y":745.0},{"x":995.0,"y":745.0},{"x":5.0,"y":735.0},{"x":995.0,"y":735.0},{"x":5.0,"y":725.0},{"x":995.0,"y":725.0},{"x":5.0,"y":715.0},{"x":995.0,"y":715.0},{"x":5.0,"y":705.0},{"x":995.0,"y":705.0},{"x":5.0,"y":695.0},{"x":995.0,"y":695.0},{"x":5.0,"y":685.0},{"x":995.0,"y":685.0},{"x":5.0,"y":675.0},{"x":995.0,"y":675.0},{"x":5.0,"y":665.0},{"x":995.0,"y":665.0},{"x":5.0,"y":655.0},{"x":995.0,"y":655.0},{"x":5.0,"y":645.0},{"x":995.0,"y":645.0},{"x":5.0,"y":635.0},{"x":995.0,"y":635.0},{"x":5.0,"y":625.0},{"x":995.0,"y":625.0},{"x":5.0,"y":615.0},{"x":995.0,"y":615.0},{"x":5.0,"y":605.0},{"x":995.0,"y":605.0},{"x":5.0,"y":595.0},{"x":995.0,"y":595.0},{"x":5.0,"y":585.0},{"x":995.0,"y":585.0},{"x":5.0,"y":575.0},{"x":995.0,"y":575.0},{"x":5.0,"y":565.0},{"x":995.0,"y":565.0},{"x":5.0,"y":555.0},{"x":995.0,"y":555.0},{"x":5.0,"y":545.0},{"x":995.0,"y":545.0},{"x":5.0,"y":535.0},{"x":995.0,"y":535.0},{"x":5.0,"y":525.0},{"x":995.0,"y":525.0},{"x":5.0,"y":515.0},{"x":995.0,"y":515.0},{"x":5.0,"y":505.0},{"x":995.0,"y":505.0},{"x":5.0,"y":495.0},{"x":995.0,"y":495.0},{"x":5.0,"y":485.0},{"x":995.0,"y":485.0},{"x":5.0,"y":475.0},{"x":995.0,"y":475.0},{"x":5.0,"y":465.0},{"x":995.0,"y":465.0},{"x":5.0,"y":455.0},{"x":995.0,"y":455.0},{"x":5.0,"y":445.0},{"x":995.0,"y":445.0},{"x":5.0,"y":435.0},{"x":995.0,"y":435.0},{"x":5.0,"y":425.0},{"x":995.0,"y":425.0},{"x":5.0,"y":415.0},{"x":995.0,"y":415.0},{"x":5.0,"y":405.0},{"x":995.0,"y":405.0},{"x":5.0,"y":395.0},{"x":995.0,"y":395.0},{"x":5.0,"y":385.0},{"x":995.0,"y":385.0},{"x":5.0,"y":375.0},{"x":995.0,"y":375.0},{"x":5.0,"y":365.0},{"x":995.0,"y":365.0},{"x":5.0,"y":355.0},{"x":995.0,"y":355.0},{"x":5.0,"y":345.0},{"x":995.0,"y":345.0},{"x":5.0,"y":335.0},{"x":995.0,"y":335.0},{"x":5.0,"y":325.0},{"x":995.0,"y":325.0},{"x":5.0,"y":315.0},{"x":995.0,"y":315.0},{"x":5.0,"y":305.0},{"x":995.0,"y":305.0},{"x":5.0,"y":295.0},{"x":995.0,"y":295.0},{"x":5.0,"y":285.0},{"x":995.0,"y":285.0},{"x":5.0,"y":275.0},{"x":995.0,"y":275.0},{"x":5.0,"y":265.0},{"x":995.0,"y":265.0},{"x":5.0,"y":255.0},{"x":995.0,"y":255.0},{"x":5.0,"y":245.0},{"x":995.0,"y":245.0},{"x":5.0,"y":235.0},{"x":995.0,"y":235.0},{"x":5.0,"y":225.0},{"x":995.0,"y":225.0},{"x":5.0,"y":215.0},{"x":995.0,"y":215.0},{"x":5.0,"y":205.0},{"x":995.0,"y":205.0},{"x":5.0,"y":195.0},{"x":995.0,"y":195.0},{"x":5.0,"y":185.0},{"x":995.0,"y":185.0},{"x":5.0,"y":175.0},{"x":995.0,"y":175.0},{"x":5.0,"y":165.0},{"x":995.0,"y":165.0},{"x":5.0,"y":155.0},{"x":995.0,"y":155.0},{"x":5.0,"y":145.0},{"x":995.0,"y":145.0},{"x":5.0,"y":135.0},{"x":995.0,"y":135.0},{"x":5.0,"y":125.0},{"x":995.0,"y":125.0},{"x":5.0,"y":115.0},{"x":995.0,"y":115.0},{"x":5.0,"y":105.0},{"x":995.0,"y":105.0},{"x":5.0,"y":95.0},{"x":995.0,"y":95.0},{"x":5.0,"y":85.0},{"x":995.0,"y":85.0},{"x":5.0,"y":75.0},{"x":995.0,"y":75.0},{"x":5.0,"y":65.0},{"x":995.0,"y":65.0},{"x":5.0,"y":55.0},{"x":995.0,"y":55.0},{"x":5.0,"y":45.0},{"x":995.0,"y":45.0},{"x":5.0,"y":35.0},{"x":995.0,"y":35.0},{"x":5.0,"y":25.0},{"x":995.0,"y":25.0},{"x":5.0,"y":15.0},{"x":995.0,"y":15.0},{"x":5.0,"y":5.0},{"x":15.0,"y":5.0},{"x":25.0,"y":5.0},{"x":35.0,"y":5.0},{"x":45.0,"y":5.0},{"x":55.0,"y":5.0},{"x":65.0,"y":5.0},{"x":75.0,"y":5.0},{"x":85.0,"y":5.0},{"x":95.0,"y":5.0},{"x":105.0,"y":5.0},{"x":115.0,"y":5.0},{"x":125.0,"y":5.0},{"x":135.0,"y":5.0},{"x":145.0,"y":5.0},{"x":155.0,"y":5.0},{"x":165.0,"y":5.0},{"x":175.0,"y":5.0},{"x":185.0,"y":5.0},{"x":195.0,"y":5.0},{"x":205.0,"y":5.0},{"x":215.0,"y":5.0},{"x":225.0,"y":5.0},{"x":235.0,"y":5.0},{"x":245.0,"y":5.0},{"x":255.0,"y":5.0},{"x":265.0,"y":5.0},{"x":275.0,"y":5.0},{"x":285.0,"y":5.0},{"x":295.0,"y":5.0},{"x":305.0,"y":5.0},{"x":315.0,"y":5.0},{"x":325.0,"y":5.0},{"x":335.0,"y":5.0},{"x":345.0,"y":5.0},{"x":355.0,"y":5.0},{"x":365.0,"y":5.0},{"x":375.0,"y":5.0},{"x":385.0,"y":5.0},{"x":395.0,"y":5.0},{"x":405.0,"y":5.0},{"x":415.0,"y":5.0},{"x":425.0,"y":5.0},{"x":435.0,"y":5.0},{"x":445.0,"y":5.0},{"x":455.0,"y":5.0},{"x":465.0,"y":5.0},{"x":475.0,"y":5.0},{"x":485.0,"y":5.0},{"x":495.0,"y":5.0},{"x":505.0,"y":5.0},{"x":515.0,"y":5.0},{"x":525.0,"y":5.0},{"x":535.0,"y":5.0},{"x":545.0,"y":5.0},{"x":555.0,"y":5.0},{"x":565.0,"y":5.0},{"x":575.0,"y":5.0},{"x":585.0,"y":5.0},{"x":595.0,"y":5.0},{"x":605.0,"y":5.0},{"x":615.0,"y":5.0},{"x":625.0,"y":5.0},{"x":635.0,"y":5.0},{"x":645.0,"y":5.0},{"x":655.0,"y":5.0},{"x":665.0,"y":5.0},{"x":675.0,"y":5.0},{"x":685.0,"y":5.0},{"x":695.0,"y":5.0},{"x":705.0,"y":5.0},{"x":715.0,"y":5.0},{"x":725.0,"y":5.0},{"x":735.0,"y":5.0},{"x":745.0,"y":5.0},{"x":755.0,"y":5.0},{"x":765.0,"y":5.0},{"x":775.0,"y":5.0},{"x":785.0,"y":5.0},{"x":795.0,"y":5.0},{"x":805.0,"y":5.0},{"x":815.0,"y":5.0},{"x":825.0,"y":5.0},{"x":835.0,"y":5.0},{"x":845.0,"y":5.0},{"x":855.0,"y":5.0},{"x":865.0,"y":5.0},{"x":875.0,"y":5.0},{"x":885.0,"y":5.0},{"x":895.0,"y":5.0},{"x":905.0,"y":5.0},{"x":915.0,"y":5.0},{"x":925.0,"y":5.0},{"x":935.0,"y":5.0},{"x":945.0,"y":5.0},{"x":955.0,"y":5.0},{"x":965.0,"y":5.0},{"x":975.0,"y":5.0},{"x":985.0,"y":5.0},{"x":995.0,"y":5.0}]}`
  }

  getSquareAtCords(x, y) {
    var result = "";
    var realX = x;
    var realY = y;



    result = '<div style="background-color: #3bba30; width: 10px; height: 10px; position: absolute;';
    result += 'top: ' + realY + 'px;';
    result += 'left: ' + realX + 'px;';
    result += '">';
    result += '</div>';
    return result
  }

  // "width":1000,"height":800,"biggestHeight":1015,"platforms"

  readWorld() {
   var worldJson = JSON.parse(this.fetchTest());


    console.log(worldJson);

    var result = "";
    result += '<div id="wholeGame" style="background-color: blue;position: relative; width: '+ worldJson.width +'px; height: '+ worldJson.biggestHeight +'px">';

    for (var i = 0; i < worldJson.platforms.length; i++) {
      var ruut = worldJson.platforms[i];
      result += this.getSquareAtCords(ruut.x, ruut.y);
    }

    result += '</div>';
    //console.log(result);
    return result
  }


  generateTemp() {
    //this.htmlText = "laaaaame"
    this.htmlText = this.readWorld();

    setInterval(function() {
      console.log("should repeat");
      var box = document.getElementById("testbox");
      var pos = document.getElementById('testbox').getBoundingClientRect();
      var y = pos.top;
      box.style.top = y + 20 +'px';
    }, 500);

  }


  activate() {
    window.addEventListener('keypress', this.handleKeyInput, false);
  }

  deactivate() {
    window.removeEventListener('keypress', this.handleKeyInput);
  }

  handleJump() {
    console.log("i should jump..")
  }


  handleKeyInput = (event) => {
    console.log(event);
    console.log(event.key);
    console.log(document.getElementById("testbox").innerHTML);
    var box = document.getElementById("testbox");
    box.style.position = 'absolute';

    var pos = document.getElementById('testbox').getBoundingClientRect();
    var y = pos.top;
    var x = pos.left;

    if(event.key == "d") {
      box.style.left = x + 20+'px';
    }
    if(event.key == "a") {
      box.style.left = x - 20 +'px';
    }

    if(event.key == "w") {
      handleJump(x, y, box);
    }

    //box.style.top = y + 20+'px';
  }
}


